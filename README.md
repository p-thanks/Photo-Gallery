# 📸 Photo Gallery

<div align="center">

```
╔══════════════════════════════════════════════════════════╗
║                                                          ║
║    🖼️  📷  🎨  PHOTO GALLERY APPLICATION  🎨  📷  🖼️    ║
║                                                          ║
╚══════════════════════════════════════════════════════════╝
```

**A modern, responsive photo gallery built with Spring Boot**

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17+-orange.svg)](https://www.oracle.com/java/)
[![Tailwind CSS](https://img.shields.io/badge/Tailwind-CSS-38B2AC.svg)](https://tailwindcss.com/)
[![H2 Database](https://img.shields.io/badge/H2-Database-blue.svg)](https://www.h2database.com/)
[![Maven](https://img.shields.io/badge/Maven-Build-red.svg)](https://maven.apache.org/)

</div>

---

## 🏗️ Architecture

```
┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
┃                    CLIENT SIDE                      ┃
┃  ┌──────────────────────────────────────────────┐  ┃
┃  │         🌐 Web Browser (User)                │  ┃
┃  └─────────────────┬────────────────────────────┘  ┃
┗━━━━━━━━━━━━━━━━━━━━┿━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                     │ HTTP Request/Response
┏━━━━━━━━━━━━━━━━━━━━┿━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
┃  ┌─────────────────▼────────────────────────────┐  ┃
┃  │  🎨 HTML + Tailwind CSS + Thymeleaf          │  ┃
┃  │     (Presentation Layer)                     │  ┃
┃  └─────────────────┬────────────────────────────┘  ┃
┃                    │                                ┃
┃  ┌─────────────────▼────────────────────────────┐  ┃
┃  │  ⚙️  Spring Boot Controllers                  │  ┃
┃  │     (Business Logic Layer)                   │  ┃
┃  └─────────────────┬────────────────────────────┘  ┃
┃                    │                                ┃
┃  ┌─────────────────▼────────────────────────────┐  ┃
┃  │  💾 Spring Data JPA                          │  ┃
┃  │     (Data Access Layer)                      │  ┃
┃  └─────────────────┬────────────────────────────┘  ┃
┃                    │                                ┃
┃  ┌─────────────────▼────────────────────────────┐  ┃
┃  │  🗄️  H2 In-Memory Database                   │  ┃
┃  │     (Data Storage)                           │  ┃
┃  └──────────────────────────────────────────────┘  ┃
┃                SERVER SIDE                          ┃
┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
```

## 🛠️ Tech Stack

<table>
<tr>
<td align="center" width="33%">

### Backend
```
    ☕
   ╔══╗
   ║☕║
   ╚══╝
```
**Spring Boot**
- REST APIs
- MVC Pattern
- Dependency Injection

</td>
<td align="center" width="33%">

### Frontend
```
    🎨
   ╔══╗
   ║🖌️║
   ╚══╝
```
**Tailwind + Thymeleaf**
- Responsive Design
- Server-side Rendering
- Utility-first CSS

</td>
<td align="center" width="33%">

### Database
```
    💾
   ╔══╗
   ║📊║
   ╚══╝
```
**H2 Database**
- In-Memory Storage
- Zero Configuration
- SQL Console

</td>
</tr>
</table>

## 📦 Project Structure

```
photo-gallery/
│
├── 📂 src/main/java/
│   └── 📂 com/yourpackage/
│       ├── 📄 PhotoGalleryApplication.java
│       ├── 📂 controller/
│       │   └── 📄 PhotoController.java
│       ├── 📂 model/
│       │   └── 📄 Photo.java
│       ├── 📂 repository/
│       │   └── 📄 PhotoRepository.java
│       └── 📂 service/
│           └── 📄 PhotoService.java
│
├── 📂 src/main/resources/
│   ├── 📂 templates/
│   │   ├── 📄 index.html
│   │   └── 📄 gallery.html
│   ├── 📂 static/
│   │   └── 📂 uploads/
│   └── 📄 application.properties
│
└── 📄 pom.xml (Maven)
```

## 🚀 Quick Start

```bash
# 1️⃣ Clone the repository
git clone <your-repo-url>
cd photo-gallery

# 2️⃣ Build the project
mvn clean install

# 3️⃣ Run the application
mvn spring-boot:run

# 4️⃣ Open your browser
# 🌐 http://localhost:8080
```

<div align="center">

```
┌─────────────────────────────────────┐
│  ✅ Application Started!            │
│  🌍 http://localhost:8080           │
│  🗄️  H2 Console: /h2-console        │
└─────────────────────────────────────┘
```

</div>

## ✨ Features

<table>
<tr>
<td width="50%">

#### 📤 Upload Photos
```
┌──────────────┐
│ [📁 Choose]  │
│              │
│ ┌──────────┐ │
│ │ Upload ⬆️│ │
│ └──────────┘ │
└──────────────┘
```

</td>
<td width="50%">

#### 🖼️ View Gallery
```
┌───┬───┬───┐
│ 🖼️│ 🖼️│ 🖼️│
├───┼───┼───┤
│ 🖼️│ 🖼️│ 🖼️│
└───┴───┴───┘
Responsive Grid
```

</td>
</tr>
<tr>
<td width="50%">

#### 💾 Auto-Save
```
  Upload → 💾 → Database
            ↓
       ✅ Stored!
```

</td>
<td width="50%">

#### 📱 Responsive
```
💻 Desktop | 📱 Mobile | 📟 Tablet
    ✓      |     ✓     |    ✓
```

</td>
</tr>
</table>

## 🗄️ Database Configuration

<div align="center">

```
╔═══════════════════════════════════════╗
║      H2 Console Access                ║
╠═══════════════════════════════════════╣
║  URL: http://localhost:8080/h2-console║
║  JDBC URL: jdbc:h2:mem:testdb         ║
║  Username: sa                         ║
║  Password: (empty)                    ║
╚═══════════════════════════════════════╝
```

</div>

## 🔧 Configuration

**application.properties**
```properties
# Server Port
server.port=8080

# H2 Database
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true

# File Upload
spring.servlet.multipart.max-file-size=10MB
spring.servlet.multipart.max-request-size=10MB
```

## 📊 Workflow

```
┌─────────┐     ┌──────────┐     ┌──────────┐     ┌──────────┐
│  User   │────▶│ Upload   │────▶│  Spring  │────▶│    H2    │
│ Browser │     │  Photo   │     │   Boot   │     │ Database │
└─────────┘     └──────────┘     └──────────┘     └──────────┘
     ▲                                                    │
     │                                                    │
     └────────────────────────────────────────────────────┘
                    Retrieve & Display Photos
```

## 🎯 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| 🟢 GET | `/` | Home page |
| 🟢 GET | `/gallery` | View all photos |
| 🔵 POST | `/upload` | Upload new photo |
| 🔴 DELETE | `/delete/{id}` | Delete photo |

---

<div align="center">

### 🌟 Built with ❤️ using Spring Boot 🌟

```
┌─────────────────────────────────────────┐
│   Made with Spring Boot + Tailwind CSS  │
│        Happy Coding! 👨‍💻👩‍💻              │
└─────────────────────────────────────────┘
```

**[⭐ Star this repo](https://github.com/yourrepo)** | **[🐛 Report Bug](https://github.com/yourrepo/issues)** | **[✨ Request Feature](https://github.com/yourrepo/issues)**

</div>