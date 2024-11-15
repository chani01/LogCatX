# Android Log Library

An easy-to-use and powerful logging library for Android applications. Simplify your debugging process with customizable and efficient logging features.

---

## 🌟 Features
- **Simple API**: Minimal setup with intuitive method calls.
- **Customizable Tags**: Easily set default tags for better log organization.
- **Log Levels**: Supports various log levels (DEBUG, INFO, WARN, ERROR, TRACE).
- **File Logging**: Optionally persist logs to a file for debugging.
- **Flexible Logging Control**: Enable or disable logging dynamically using `isLoggingEnabled`.

---

## 🚀 Installation

[![GitHub release (latest by date)](https://img.shields.io/github/v/release/chani01/LogCatX?label=Latest%20Version)](https://github.com/chani01/LogCatX/releases)

1. **Add the dependency** to your `build.gradle` file:
   ```gradle
   dependencies {
       implementation 'com.chani01:LogCatX:<latest_version>'
   }
   ```

2. **Sync the project**.

---

## 📖 Usage

### Initialization
You can initialize `Dlog` in your `Application` class or any entry point of your app:

```kotlin
Dlog.init(
    defaultTag = "MyAppTag",  // Default tag for all logs
    isLoggingEnabled = BuildConfig.DEBUG,  // Enable or disable logging dynamically
    logFileName = "app_logs.txt"  // File name for log persistence (optional)
)
```

### Explanation of Parameters
- **`defaultTag`**: The default tag used in all log messages.
- **`isLoggingEnabled`**: Controls whether logging is active:
  - `true`: Enables logging.
  - `false`: Disables logging (e.g., in Release mode).
- **`logFileName`**: (Optional) Specifies the file to save logs for debugging purposes.

---

### Basic Logging
After initialization, use the following methods for logging:

```kotlin
Dlog.d("This is a debug message")    // Debug log
Dlog.i("This is an info message")    // Info log
Dlog.w("This is a warning")          // Warning log
Dlog.e("This is an error message")   // Error log
```

---


## 🛠 Configuration Example

Here’s how you might configure `Dlog` in your `Application` class:

```kotlin
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Dlog.init(
            defaultTag = "MyAppTag",
            isLoggingEnabled = BuildConfig.DEBUG,  // Automatically enable or disable logging
            logFileName = "app_logs.txt"  // Save logs in Debug mode
        )
    }
}
```

---

## 🛡️ Log in Release Builds

For release builds, ensure logging is automatically disabled for performance and security:

- **Debug Mode**: Logs are enabled for thorough testing.
- **Release Mode**: Logs are suppressed for performance and security by setting `isLoggingEnabled` to `false`.

---

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## 🙌 Contributions

Contributions are welcome! Feel free to open issues, submit pull requests, or suggest new features. 😊
