<div align="center">

# 🚆 Train Consist Management System

[![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Collections Framework](https://img.shields.io/badge/Java%20Collections-Framework-blue?style=for-the-badge&logo=java&logoColor=white)](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/)
[![OOP](https://img.shields.io/badge/Paradigm-OOP-green?style=for-the-badge&logo=java&logoColor=white)](https://en.wikipedia.org/wiki/Object-oriented_programming)
[![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)](LICENSE)
[![GitHub repo size](https://img.shields.io/github/repo-size/lavansh1306/Train_Booking?style=for-the-badge&logo=github)](https://github.com/lavansh1306/Train_Booking)
[![GitHub last commit](https://img.shields.io/github/last-commit/lavansh1306/Train_Booking?style=for-the-badge&logo=github)](https://github.com/lavansh1306/Train_Booking/commits)

A Java application that demonstrates the **Java Collections Framework** through real-world train consist management scenarios — from initializing bogies to maintaining sorted schedules.

</div>

---

## 📋 Table of Contents

- [About the Project](#-about-the-project)
- [Tech Stack](#-tech-stack)
- [Use Cases](#-use-cases)
- [Java Collections Used](#-java-collections-used)
- [Project Structure](#-project-structure)
- [Getting Started](#-getting-started)
- [How to Run](#-how-to-run)
- [Contributing](#-contributing)
- [License](#-license)

---

## 📖 About the Project

The **Train Consist Management System** is a Java-based console application designed to simulate the management of train bogies (coaches). Each use case targets a specific data structure from the Java Collections Framework, demonstrating how to perform real-world operations such as adding/removing bogies, tracking unique IDs, mapping capacities, and maintaining sorted schedules.

---

## 🛠️ Tech Stack

| Technology | Badge |
|---|---|
| Language | [![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://www.oracle.com/java/) |
| Build Tool | [![Javac](https://img.shields.io/badge/Javac-Compiler-007396?style=flat-square&logo=java&logoColor=white)](https://docs.oracle.com/en/java/javase/17/docs/specs/man/javac.html) |
| Collections | [![ArrayList](https://img.shields.io/badge/ArrayList-List-4CAF50?style=flat-square)](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html) [![LinkedList](https://img.shields.io/badge/LinkedList-List-4CAF50?style=flat-square)](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/LinkedList.html) [![HashSet](https://img.shields.io/badge/HashSet-Set-2196F3?style=flat-square)](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashSet.html) [![LinkedHashSet](https://img.shields.io/badge/LinkedHashSet-Set-2196F3?style=flat-square)](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/LinkedHashSet.html) [![HashMap](https://img.shields.io/badge/HashMap-Map-FF5722?style=flat-square)](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashMap.html) [![TreeMap](https://img.shields.io/badge/TreeMap-Map-FF5722?style=flat-square)](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/TreeMap.html) |
| IDE | [![VS Code](https://img.shields.io/badge/VS%20Code-007ACC?style=flat-square&logo=visualstudiocode&logoColor=white)](https://code.visualstudio.com/) [![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-000000?style=flat-square&logo=intellijidea&logoColor=white)](https://www.jetbrains.com/idea/) |
| Version Control | [![Git](https://img.shields.io/badge/Git-F05032?style=flat-square&logo=git&logoColor=white)](https://git-scm.com/) [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat-square&logo=github&logoColor=white)](https://github.com/) |

---

## 🚀 Use Cases

| # | Use Case | Description | Collection Used |
|---|---|---|---|
| UC1 | Initialize Train Consist | Initialize an empty train and display its initial state | `ArrayList` |
| UC2 | Add Passenger Bogies | Add, remove, and check for existence of passenger bogies | `ArrayList` |
| UC3 | Track Unique Bogie IDs | Store unique bogie IDs, automatically ignoring duplicates | `HashSet` |
| UC4 | Maintain Ordered Bogie Consist | Insert at position, remove from front/rear of train consist | `LinkedList` |
| UC5 | Preserve Insertion Order | Maintain bogie formation order while preventing duplicates | `LinkedHashSet` |
| UC6 | Map Bogie to Capacity | Map each bogie type to its seating/load capacity | `HashMap` |
| UC7 | Sorted Bogie Schedule | Maintain a sorted schedule of bogies mapped to stations | `TreeMap` |

---

## 🗃️ Java Collections Used

```
Java Collections Framework
├── List
│   ├── ArrayList  → UC1, UC2  (dynamic array, fast random access)
│   └── LinkedList → UC4       (doubly-linked, fast insertion/deletion)
├── Set
│   ├── HashSet        → UC3   (unique elements, no guaranteed order)
│   └── LinkedHashSet  → UC5   (unique elements, insertion order preserved)
└── Map
    ├── HashMap  → UC6         (key-value pairs, no guaranteed order)
    └── TreeMap  → UC7         (key-value pairs, sorted by key)
```

---

## 📁 Project Structure

```
Train_Booking/
├── src/
│   ├── UseCase1TrainConsistMgmt.java   # Initialize train (ArrayList)
│   ├── UseCase2TrainConsistMgmt.java   # Add/remove passenger bogies (ArrayList)
│   ├── UseCase3TrainConsistMgmt.java   # Track unique bogie IDs (HashSet)
│   ├── UseCase4TrainConsistMgmt.java   # Ordered bogie consist (LinkedList)
│   ├── UseCase5TrainConsistMgmt.java   # Preserve insertion order (LinkedHashSet)
│   ├── UseCase6TrainConsistMgmt.java   # Bogie-capacity mapping (HashMap)
│   └── UseCase7TrainConsistMgmt.java   # Sorted bogie schedule (TreeMap)
├── .gitignore
└── README.md
```

---

## ⚙️ Getting Started

### Prerequisites

- **Java JDK 17+** — [Download here](https://www.oracle.com/java/technologies/downloads/)
- A terminal / command prompt

Verify your Java installation:

```bash
java -version
javac -version
```

### Clone the Repository

```bash
git clone https://github.com/lavansh1306/Train_Booking.git
cd Train_Booking
```

---

## ▶️ How to Run

Each use case is a standalone Java program. Compile and run any use case as shown below.

### Compile

```bash
cd src
javac UseCase1TrainConsistMgmt.java
```

### Run

```bash
java UseCase1TrainConsistMgmt
```

### Example — Run All Use Cases

```bash
cd src

# UC1 - Initialize Train
javac UseCase1TrainConsistMgmt.java && java UseCase1TrainConsistMgmt

# UC2 - Add Passenger Bogies
javac UseCase2TrainConsistMgmt.java && java UseCase2TrainConsistMgmt

# UC3 - Track Unique Bogie IDs
javac UseCase3TrainConsistMgmt.java && java UseCase3TrainConsistMgmt

# UC4 - Ordered Bogie Consist
javac UseCase4TrainConsistMgmt.java && java UseCase4TrainConsistMgmt

# UC5 - Preserve Insertion Order
javac UseCase5TrainConsistMgmt.java && java UseCase5TrainConsistMgmt

# UC6 - Bogie-Capacity Mapping
javac UseCase6TrainConsistMgmt.java && java UseCase6TrainConsistMgmt

# UC7 - Sorted Bogie Schedule
javac UseCase7TrainConsistMgmt.java && java UseCase7TrainConsistMgmt
```

### Sample Output (UC1)

```
======================================
=== Train Consist Management App ===
======================================
Train initialized successfully...
Initial Bogie Count: 0
Current Train Consist: []
System ready for operations...
```

---

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. **Fork** the repository
2. Create a new branch: `git checkout -b feature/your-feature-name`
3. **Commit** your changes: `git commit -m 'Add some feature'`
4. **Push** to the branch: `git push origin feature/your-feature-name`
5. Open a **Pull Request**

---

## 📄 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.

---

<div align="center">

Made with ❤️ by [lavansh1306](https://github.com/lavansh1306)

[![GitHub followers](https://img.shields.io/github/followers/lavansh1306?style=social)](https://github.com/lavansh1306)
[![GitHub stars](https://img.shields.io/github/stars/lavansh1306/Train_Booking?style=social)](https://github.com/lavansh1306/Train_Booking/stargazers)

</div>