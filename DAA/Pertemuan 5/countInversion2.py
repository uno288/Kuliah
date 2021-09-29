# HITUNG INVERSI DENGAN DEVIDE AND CONQUER

def countInversion(arr):
    kali = 0
    if len(arr) <= 1:
        return kali

    tengah = len(arr)//2
    kiri = arr[:tengah]
    kanan = arr[tengah :]
    kali += countInversion(kiri)
    kali += countInversion(kanan)
    i = j = k = 0

    #print(kiri)
    #print(kanan) 

    while i < len(kiri) and j < len(kanan):
        if kiri[i] < kanan[j]:
            arr[k] = kiri[i]
            i += 1
        else :
            #print(kiri[i], kanan[j])
            arr[k] = kanan[j]
            j += 1
            kali += (tengah -i)

        k += 1

    while i < len(kiri): 
        arr[k] = kiri[i]
        i += 1
        k += 1

    while j < len (kanan):
        arr[k] = kanan[j]
        j += 1
        k += 1
    
    return kali

arr = [1, 20, 6, 4, 5]

result = countInversion(arr)
print(result)