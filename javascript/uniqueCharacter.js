function hasAllUniqueCharacters(str) {
    let checker = 0;
    for (let i = 0; i < str.length; i++) {
        const c = str[i];
        if (c < 'a' || c > 'z') {
            throw new Error(`Character '${c}' is not a lowercase letter (a-z).`);
        }
        const bitIndex = str.charCodeAt(i) - 'a'.charCodeAt(0);
        if ((checker & (1 << bitIndex)) !== 0) {
            return false;
        }
        checker |= (1 << bitIndex);
    }
    return true;
}

const testCases = ["abcdef", "aabcde", "xyz", "aabb", "programming"];
for (const input of testCases) {
    console.log(`"${input}" -> ${hasAllUniqueCharacters(input) ? "All unique" : "Has duplicates"}`);
}
