# Contributing to Java Fundamentals & Data Structures

Thank you for your interest in contributing to this repository! This project serves as a comprehensive, beginner-friendly learning guide for Java programming and Data Structures & Algorithms (DSA).

---

## How to Contribute

### 1. Reporting Issues
If you spot a bug, typo, or logic error in any example, please open an Issue detailing:
- File path and line number
- Description of the issue
- Expected vs. actual behavior

### 2. Adding New Educational Examples
We welcome contributions that introduce new topics or extend existing ones! Please adhere to the following guidelines:

1. **Standard File Header**: Every `.java` file must include the standardized documentation block at the top:
   ```java
   /**
    * Program Name : <ProgramName>
    * Topic        : <Topic Name>
    * Difficulty   : Beginner / Intermediate / Advanced
    * Concepts     : <Key concepts demonstrated>
    * -------------------------------------------------------------
    * Description  :
    * <Clear, concise explanation of the program>
    */
   ```
2. **Code Style & Formatting**:
   - Follow standard Java naming conventions (`camelCase` for variables/methods, `PascalCase` for classes).
   - Use clear variable names (`array` instead of `a`, `length` instead of `l`).
   - Include educational comments explaining **why** something is done, tricky logic, or common beginner mistakes. Avoid redundant comments on obvious Java syntax.
3. **Compilation Check**:
   Ensure your code compiles clean without errors or warnings:
   ```bash
   javac YourProgram.java
   java YourProgram
   ```

### 3. Pull Request Process
1. Fork the repository.
2. Create a feature branch: `git checkout -b feature/topic-name`.
3. Commit your changes with a clear message: `git commit -m "Add Binary Search Tree deletion example"`.
4. Push to your branch and submit a Pull Request.

---

Happy Coding! 🚀
