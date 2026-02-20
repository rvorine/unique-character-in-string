def has_all_unique_characters(s):
    checker = 0
    for c in s:
        if not ('a' <= c <= 'z'):
            raise ValueError(f"Character '{c}' is not a lowercase letter (a-z).")
        bit_index = ord(c) - ord('a')
        if checker & (1 << bit_index):
            return False
        checker |= (1 << bit_index)
    return True


if __name__ == "__main__":
    test_cases = ["abcdef", "aabcde", "xyz", "aabb", "programming"]
    for input_str in test_cases:
        result = "All unique" if has_all_unique_characters(input_str) else "Has duplicates"
        print(f'"{input_str}" -> {result}')
