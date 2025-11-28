# 🎬 Video Chapter Editor (Kotlin/JavaFX)

A desktop application designed to create, edit, and manage precise timed chapters for video files, built using **Kotlin** and **JavaFX**. It features robust time-tracking synced to the video playback, allowing users to define chapters down to the millisecond.

## ✨ Features

  * **Stable Video Playback:** Utilizes the **JavaFX Media** framework for stable video playback and time synchronization.
  * **Chapter Management:** Add, delete, and modify chapter names directly within the application's side panel.
  * **Time Navigation:** Double-click a chapter in the table to instantly **seek** (jump) to the precise moment in the video.
  * **Data Persistence:** Save and load chapters from external files (TXT/CSV).
  * **FFmpeg Export:** Export chapters into the standard **FFmpeg Chapter Format**, ready for merging with the original video file for broad compatibility with players like VLC and YouTube.

## 🛠️ Technology Stack

| Component | Technology | Role |
| :--- | :--- | :--- |
| **Language** | **Kotlin** | Primary programming language (JVM). |
| **GUI Framework** | **JavaFX** | Used for creating the cross-platform desktop application interface. |
| **Build Tool** | **Gradle** | Dependency management and build automation. |
| **Muxing (External)** | **FFmpeg** | Required on the host system (via command line) to merge exported chapters into video files. |

## 🚀 Getting Started

### Prerequisites

1.  **Java Development Kit (JDK):** Version **17 or higher** (required for JavaFX 21).
2.  **FFmpeg:** Must be installed and accessible via your system's **PATH** environment variable (required for the chapter merging/export function).

### Running the Application

1.  Clone this repository.
2.  Open the project in **IntelliJ IDEA**.
3.  Ensure Gradle has synchronized the dependencies (`build.gradle.kts`).
4.  Run the `main` function in `Main.kt`.

### Building an Installer

The project is configured with the **jpackage** plugin to create native installers (e.g., `.exe` or `.msi`).

1.  Open the terminal in the project root.
2.  Run the Gradle task to build the native runtime image:
    ```bash
    ./gradlew jlink
    ```
3.  Run the Gradle task to generate the native installer:
    ```bash
    ./gradlew jpackage
    ```
    *(The installer file will be located in the `build/jpackage` directory.)*
