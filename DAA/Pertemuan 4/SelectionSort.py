def SelectionSort(list):
    for isi in range(len(list) - 1, 0, -1):
        max = 0
        for loc in range(1, isi - 1):
            
            if list[loc] > list[max]:
                max = loc
                
        list[isi], list[max] = list[max],list[isi]
    
    return list

def AsSelectionSort(list):
    for isi in range(len(list) - 1):
        min = isi
        for loc in range(-1, isi - 1):
            
            if list[loc] > list[min]:
                min = loc

        if(min != isi):             
            list[isi], list[min] = list[min],list[isi]

    return list

    
#list = [70,15,25,19,34,44]
list = [89,12,57,16,25]

#print(SelectionSort(list))
print(AsSelectionSort(list))