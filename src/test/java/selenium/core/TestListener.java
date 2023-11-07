package selenium.core;

import io.qameta.allure.Attachment;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

import static selenium.core.BaseTest.driver;

public class TestListener implements TestWatcher {

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        attachBrowserLogs();
        attachScreenshot();
    }

    @Attachment("Browser Logs")
    private byte[] attachBrowserLogs() {
        WebDriver webDriver = driver;
        if (webDriver != null) {
            LogEntries logs = webDriver.manage().logs().get(LogType.BROWSER);
            StringBuilder logText = new StringBuilder();
            logs.forEach(entry -> logText.append(entry.getMessage()).append("\n"));
            return logText.toString().getBytes();
        }
        return new byte[0];
    }

    @Attachment("Screenshot")
    private byte[] attachScreenshot() {
        WebDriver webDriver = driver;
        if (webDriver != null) {
            return ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
        }
        return new byte[0];
    }
}
