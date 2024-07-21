package selenium.core;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

import static selenium.core.BaseTest.driver;

public class TestListener implements TestWatcher {

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        attachBrowserLogs();
        attachScreenshot();
        attachLog(context.getDisplayName());
    }

    @Attachment(value = "Browser Logs", type = "text/plain")
    private byte[] attachBrowserLogs() {
        if (driver != null) {
            LogEntries logs = driver.manage().logs().get(LogType.BROWSER);
            StringBuilder logText = new StringBuilder();
            logs.forEach(entry -> logText.append(entry.getMessage()).append("\n"));
            return logText.toString().getBytes();
        }
        return new byte[0];
    }

    @Attachment(value = "Screenshot", type = "image/png")
    private byte[] attachScreenshot() {
        if (driver != null) {
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        }
        return new byte[0];
    }

    @Step("{stepDescription}")
    public void attachLog(String stepDescription) {
        Allure.step(stepDescription);
    }
}