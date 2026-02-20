# Unique Character in String

[![Instagram](https://img.shields.io/badge/Instagram-lacopydepastel-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/lacopydepastel)
[![YouTube](https://img.shields.io/badge/YouTube-%40rvorine-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://www.youtube.com/@rvorine)

---

## Problem Statement

Write a program to find if a **String has all unique characters** using **one `int` variable** and the **bit shift operator**.

---

## Algorithm

The key idea is to use a single integer as a **bit vector** (a set of flags), where each bit represents whether a particular character has been seen before.

**Steps:**
1. Initialize `checker = 0`.
2. For each character `c` in the string, calculate its **bit index**: `bitIndex = c - 'a'`.
3. Check if the bit at position `bitIndex` is already set in `checker`:
   - If `(checker & (1 << bitIndex)) != 0` → the character is a **duplicate** → return `false`.
4. Set the bit: `checker |= (1 << bitIndex)`.
5. If the loop finishes without finding a duplicate, return `true`.

**Why it works:**  
Each character maps to a unique bit position in the integer. If we encounter a character whose bit is already set, we know it appeared before — so the string has duplicates.

> **Note:** This approach works for strings containing only lowercase English letters (`a`–`z`), since a 32-bit `int` has 32 bits which covers all 26 letters.

---

## Example

| Input         | Output          |
|---------------|-----------------|
| `"abcdef"`    | All unique      |
| `"aabcde"`    | Has duplicates  |
| `"xyz"`       | All unique      |
| `"aabb"`      | Has duplicates  |
| `"programming"` | Has duplicates |

---

## Implementations

| Language    | File                                        |
|-------------|---------------------------------------------|
| Kotlin      | [`kotlin/UniqueCharacter.kt`](kotlin/UniqueCharacter.kt) |
| Java        | [`java/UniqueCharacter.java`](java/UniqueCharacter.java) |
| C           | [`c/unique_character.c`](c/unique_character.c) |
| C#          | [`csharp/UniqueCharacter.cs`](csharp/UniqueCharacter.cs) |
| Python      | [`python/unique_character.py`](python/unique_character.py) |
| JavaScript  | [`javascript/uniqueCharacter.js`](javascript/uniqueCharacter.js) |

---

## How to Run

### Kotlin
```bash
cd kotlin
kotlinc UniqueCharacter.kt -include-runtime -d UniqueCharacter.jar
java -jar UniqueCharacter.jar
```

### Java
```bash
cd java
javac UniqueCharacter.java
java UniqueCharacter
```

### C
```bash
cd c
gcc unique_character.c -o unique_character
./unique_character
```

### C#
```bash
cd csharp
# Using .NET SDK
dotnet new console -n UniqueCharacter --force
cp UniqueCharacter.cs UniqueCharacter/Program.cs
cd UniqueCharacter && dotnet run
```

### Python
```bash
cd python
python unique_character.py
```

### JavaScript
```bash
cd javascript
node uniqueCharacter.js
```

---

## Like & Subscribe

If you found this helpful, please like and subscribe! 🙏

[![Instagram](https://img.shields.io/badge/Follow%20on%20Instagram-lacopydepastel-E4405F?style=flat-square&logo=instagram&logoColor=white)](https://www.instagram.com/lacopydepastel)
[![YouTube](https://img.shields.io/badge/Subscribe%20on%20YouTube-%40rvorine-FF0000?style=flat-square&logo=youtube&logoColor=white)](https://www.youtube.com/@rvorine)