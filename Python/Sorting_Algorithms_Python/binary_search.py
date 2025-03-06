def wyszukiwanie_binarne(arr, x):
    l = 0
    r = len(arr) - 1
    mid = (l+r) // 2

    while l <= r:
        mid = (l + r) // 2

        if arr[mid] == x:
            return mid
        elif arr[mid] > x:
            r = mid - 1
        else:
            l = mid + 1
    return -1

arr = [1,2,3,4,5,6,8,9]

print(wyszukiwanie_binarne(arr, 8))
