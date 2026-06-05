def mergeBatteryBackup(listA, listB):
    return [
        (a if a is not None else 0) + (b if b is not None else 0)
        for a, b in zip(listA, reversed(listB))
    ]


if __name__ == "__main__":
    shelf1 = [12, 5, None, 9]
    shelf2 = [4, None, 7, 3]

    result = mergeBatteryBackup(shelf1, shelf2)
    print(result)
