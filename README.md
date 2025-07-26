```markdown
# 📱 Jetpack Compose Bottom Navigation App

This is a simple and clean Android application built using **Jetpack Compose** that demonstrates how to implement **bottom navigation with badges and icons**. The project is modular and scalable, with each screen separated for easy maintenance.

---

## ✨ Features

- 🧭 Bottom navigation bar using **Jetpack Compose**
- 🟢 Active tab highlighting with icons
- 🔔 Badge notification support (e.g., unread messages count)
- 🔄 Seamless screen transitions
- 📁 Clean and organized folder structure

---

## 📂 Project Structure

```
src/
├── bnview/
│   ├── BottomNavItem.kt         # Data class for bottom nav items
│   └── bnview.kt                # Main Bottom Navigation Composable
├── screens/
│   ├── Home.kt                  # Home screen
│   ├── Settings.kt              # Settings screen
│   ├── Notifications.kt         # Notifications screen with badge
│   └── Profile.kt               # Profile screen
├── ui/
│   └── theme/                   # App theme setup (colors, typography, etc.)
│       ├── Color.kt
│       ├── Theme.kt
│       └── Type.kt
├── MainActivity.kt              # App entry point
└── statusbarcolor.kt           # Status bar color handler
```

---

## 🧱 BottomNavItem.kt

```kotlin
data class BottomNavItem(
    val title: String,
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean = false,
    val badges: Int = 0
)
```

This model handles dynamic navigation item rendering with optional badges.

---

## 📸 Preview

<p align="center">
  <img src="s1" alt="Home Screen" width="300"/>
</p>

<p align="center">
  <img src="s2" alt="Settings Screen" width="300"/>
</p>

<p align="center">
  <img src="s3" alt="Notifications Screen" width="300"/>
</p>

<p align="center">
  <img src="s4" alt="Profile Screen" width="300"/>
</p>

---

## 🚀 Getting Started

1. **Clone this repo:**

   ```bash
   git clone https://github.com/yourusername/compose-bottom-navigation.git
   ```

2. **Open in Android Studio**

3. **Run on emulator or physical device**

---

## 🛠️ Tech Stack

- **Kotlin**
- **Jetpack Compose**
- **Material Icons**
- **Android Studio Giraffe or higher**

---

## 🧑‍💻 Author

**Tanvir Ahmed**  
Feel free to contribute or reach out for improvements or issues!

---

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).
```
