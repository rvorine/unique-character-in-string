using System;

class UniqueCharacter
{
    static bool HasAllUniqueCharacters(string str)
    {
        int checker = 0;
        foreach (char c in str)
        {
            if (c < 'a' || c > 'z')
            {
                throw new ArgumentException($"Character '{c}' is not a lowercase letter (a-z).");
            }
            int bitIndex = c - 'a';
            if ((checker & (1 << bitIndex)) != 0)
            {
                return false;
            }
            checker |= (1 << bitIndex);
        }
        return true;
    }

    static void Main()
    {
        string[] testCases = { "abcdef", "aabcde", "xyz", "aabb", "programming" };
        foreach (string input in testCases)
        {
            Console.WriteLine($"\"{input}\" -> {(HasAllUniqueCharacters(input) ? "All unique" : "Has duplicates")}");
        }
    }
}
