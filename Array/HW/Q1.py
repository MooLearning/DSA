def mergeBatteryBackup(batteryA, batteryB):
    return [
        (a if a is not None else 0) + (b if b is not None else 0)
        for a, b in zip(batteryA, reversed(batteryB))
    ]


if __name__ == "__main__":
    batteryA = [6, None, 4, -2, None]
    batteryB = [3, 8, None, 5, 7]

    result = mergeBatteryBackup(batteryA, batteryB)
    print(result)
