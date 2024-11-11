# 📘 Android Log Library

An easy-to-use and powerful logging library for Android applications. Simplify your debugging process with customizable and efficient logging features.

---

## 🌟 Features
- **Simple API**: Minimal setup with intuitive method calls.
- **Log Levels**: Supports various log levels (e.g., DEBUG, INFO, WARN, ERROR).
- **Customizable Tags**: Define your own tags for better log organization.
- **Log Filtering**: Easily filter logs by level or tag.
- **Release Mode Safety**: Automatically disables logs in production builds to keep your app lightweight and secure.
- **File Logging**: Save logs to a file for persistent debugging.
- **Thread and Method Info**: Automatically includes thread name and calling method for detailed context.

---

## 🚀 Installation

1. **Add the dependency** to your `build.gradle` file:
   ```gradle
   dependencies {
       implementation 'com.chani01:LogCatX:1.0.0'
   }
   ```

2. **Sync the project**.

## 📖 Usage

### Basic Logging
```kotlin
Dlog.d("This is a debug message")
Dlog.i("This is an info message")
Dlog.w("This is a warning")
Dlog.e("This is an error message")
```
### Initialization
```kotlin
Dlog.init(
    defaultTag = "MyAppTag",  // Default tag for all logs
    isLoggingEnabled = BuildConfig.DEBUG,  // Enable or disable logging dynamically
    logFileName = "app_logs.txt"  // File name for log persistence (optional)
)
```
