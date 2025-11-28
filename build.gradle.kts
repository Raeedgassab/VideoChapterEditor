// build.gradle.kts

// 1. إضافات أساسية: Kotlin و Application و JavaFX
plugins {
    kotlin("jvm") version "1.9.23"
    application
    id("org.openjfx.javafxplugin") version "0.0.14" // لإدارة تبعيات JavaFX
}

// 2. إعداد JDK والتطبيق
java {
    toolchain {
        // نستخدم JDK 21 كما أشرت سابقاً
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

application {
    // اسم الكلاس الرئيسي لتشغيل التطبيق (دالة main في ملف Main.kt)
    mainClass.set("org.example.videochaptereditor.MainKt")
}

// 3. إعداد JavaFX (المكونات الضرورية)
javafx {
    version = "21.0.1"
    modules("javafx.controls", "javafx.fxml", "javafx.media") // media ضرورية لتشغيل الفيديو
}

// 4. المستودعات الرئيسية
repositories {
    mavenCentral()
}

// 5. التبعيات (Dependencies)
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // تبعيات JavaFX
    // نستخدم platform هنا لضمان التوافق
    implementation(platform("org.openjfx:javafx-controls:21.0.1"))

    // تبعيات الاختبار (إذا كنت تستخدمها)
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}