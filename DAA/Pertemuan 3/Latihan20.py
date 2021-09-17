import pandas as pd
from pandas.core.frame import DataFrame

# Penyusunan Data
df = pd.DataFrame(
    [
        ['1','Informatika', 50, 30, 20],
        ['2','Sistem Informasi', 55, 30, 25],
        ['3','Teknik Sipil', 40, 30, 10],
    ]
)

## Pengelompokan Jenis kolom
df.columns = ['No', 'Prodi', 'Mahasiswa', 'Laki2', 'Perempuan']

# output tabel
print ("Kolom")
print (df)

# output seleksi kolom
print ("Seleksi 1")
print (df[['Prodi', 'Laki2']])

print ("Seleksi 1")
print (df.iloc[:,3])