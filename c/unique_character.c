#include <stdio.h>

int hasAllUniqueCharacters(const char *str) {
    int checker = 0;
    while (*str) {
        if (*str < 'a' || *str > 'z') {
            fprintf(stderr, "Character '%c' is not a lowercase letter (a-z).\n", *str);
            return -1;
        }
        int bitIndex = *str - 'a';
        if (checker & (1 << bitIndex)) {
            return 0;
        }
        checker |= (1 << bitIndex);
        str++;
    }
    return 1;
}

int main() {
    const char *testCases[] = {"abcdef", "aabcde", "xyz", "aabb", "programming"};
    int n = sizeof(testCases) / sizeof(testCases[0]);
    for (int i = 0; i < n; i++) {
        printf("\"%s\" -> %s\n", testCases[i],
               hasAllUniqueCharacters(testCases[i]) ? "All unique" : "Has duplicates");
    }
    return 0;
}
