package org.stockify.config;

import io.github.cdimascio.dotenv.Dotenv;
import lombok.NoArgsConstructor;
import java.util.Objects;

@NoArgsConstructor
public final class AppEnvConfig {

    public static void loadEnv() {
        Dotenv dotenv = Dotenv.configure()
            .ignoreIfMissing()
            .load();
        System.setProperty("DB_URL", Objects.requireNonNull(dotenv.get("DB_URL")));
        System.setProperty("DB_USER", Objects.requireNonNull(dotenv.get("DB_USER")));
        System.setProperty("DB_PASSWORD", Objects.requireNonNull(dotenv.get("DB_PASSWORD")));
        System.setProperty("JWT_SECRET", Objects.requireNonNull(dotenv.get("JWT_SECRET")));
        System.setProperty("JWT_EXPIRATION", Objects.requireNonNull(dotenv.get("JWT_EXPIRATION")));
        System.setProperty("EMAIL_HOST", Objects.requireNonNull(dotenv.get("EMAIL_HOST")));
        System.setProperty("EMAIL_PORT", Objects.requireNonNull(dotenv.get("EMAIL_PORT")));
        System.setProperty("EMAIL_USERNAME", Objects.requireNonNull(dotenv.get("EMAIL_USERNAME")));
        System.setProperty("EMAIL_PASSWORD", Objects.requireNonNull(dotenv.get("EMAIL_PASSWORD")));
        System.setProperty("TEST_ACCESS_TOKEN", Objects.requireNonNull(dotenv.get("TEST_ACCESS_TOKEN")));
        System.setProperty("MERCADOPAGO_WEBHOOK_SECRET", Objects.requireNonNull(dotenv.get("MERCADOPAGO_WEBHOOK_SECRET")));
        System.setProperty("NOTIFICATION_URL", Objects.requireNonNull(dotenv.get("NOTIFICATION_URL")));
        System.setProperty("FRONTEND_BASE", Objects.requireNonNull(dotenv.get("FRONTEND_BASE")));
    }
}