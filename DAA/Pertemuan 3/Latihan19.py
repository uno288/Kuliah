import pandas as pd
from pandas.core.frame import DataFrame

# Penyusunan Data
df = pd.DataFrame(
    [
        ['1','Fares',32, True],
        ['2','Elena',40, False],
        ['3','Steven',23, True],
    ]
)
## Penambahan Jenis Pengelompokan Kolom
df.columns = ['id', 'name', 'age', 'decision']

## Seleksi kolom 
df[['name', 'age']]
df.iloc[:,3]

# output
print (df[['name', 'age']])
print (df.iloc[:,3])