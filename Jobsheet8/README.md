|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020210 |
| Nama |  KHOIRUL UMAM NOVALIDI |
| Kelas | TI - 1H |
| Repository | [link](https://github.com/novalrnv/PRAKALSD.git) |

# STACK

## 8.1 Mahasiswa Mengumpulakan Tugas

**Penjelasan**

- Membuat 3 class sesuai perintah [Mahasiswa12.java](sc_code/Mahasiswa12.java), [StackTugasMahasiswa12.java](sc_code/StackTugasMahasiswa12.java), dan [MahasiswaDemo12.java](sc_code/MahasiswaDemo12.java). Juga menginputkan method-method sesuai perintah.

**Verifikasi Hasil Running**

![Screenshot](img/1.1.png)
![Screenshot](img/1.2.png)

**Pertanyaan :**

1. Bagian yang perlu diperbaiki yaitu pada method `print()` pada kode baris berikut :
```java
for (int i = top; i >= 0; i--) {
```

2. Banyak data yang ditampung tergantung inputan pada saat mengedintifikasi parameter di class `main`, berikut kode programnya :
```java
StackTugasMahasiswa12 stack = new StackTugasMahasiswa12(..);
```

3. Pengecekan kondisi `!isFull()` pada method `push` diperlukan untuk menghindari terjadinya `ArrayIndexOutOfBoundsException` dan penambahan data ketika stack sudah penuh. Jika kondisi tersebut dihapus akan terjadi error karena data baru tidak dapat dimasukkan.

4. Menambahkan method baru pada class `StackTugasMahasiswa` dan menu baru pada class `MahasiswaDemo` seperti berikut : 
```java
public Mahasiswa12 bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            return null;
        }
    }
```
```java
case 4:
Mahasiswa12 bawah = stack.bottom();
                    if (bawah != null) {
                        System.out.println("Tugas terbawah dikumpulkan oleh: " + bawah.nama);
                    } else {
                        System.out.println("Stack kosong.");
                    }
                    break;
```

5. - Menambahkan method seperti berikut :
```java
public int count() {
    return top + 1;
}
```
 - Serta operasi menunya seperti berikut : 
```java
case 6:
    System.out.println("Jumlah tugas saat ini: " + stack.count());
    break;
```