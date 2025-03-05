|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020210|
| Nama |  Khoirul Umam Novalidi |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/novalrnv/PRAKALSD.git) |
  

# Jobsheet 3 - Array Of Object
  

## 3.1 Percobaan 1 - Membuat Array dari Object, Mengisi dan Menampilkan


### 3.1.1 Langkah-langkah Percobaan


Menginputkan Kode Program sesuai perintah pada file [Mahasiswa12.java](./sc_code/Mahasiswa12.java) dan [MahasiswaDemo12.java](./sc_code/MahasiswaDemo12.java).


### 3.1.2 Verifikasi Hasil Running

![Screenshot](/img/percobaan1.png)


### 3.1.3 Pertanyaan : 

1. Tidak harus selalu meliliki, Karena atribut dan method dalam array of object diperlukan sesuai kebutuhan.

2. Kode program tersebut melakukan intansiasi array of object.

3. Tidak memiliki, Pemanggilan tersebut bisa dilakukan karena jika sebuah class tidak memiliki konstruktor apapun maka java akan menyediakan konstruktor default secara otomatis.

4. Menginisiasi array sesuai indeks yang dituju.

5. Class Mahasiswa digunakan untuk memberikan atribut/method pada object, sedangkan class MahasiswaDemo digunakan untuk memanggil class dan method yang terdapat pada class Mahasiswa.


## 3.2 Percobaan 2 - Menerima Input Isian Array Menggunakan Looping


### 3.2.1 Langkah-langkah Percobaan

Menginputkan Kode Program sesuai perintah pada class [Mahasiswa12.java](./sc_code/Mahasiswa12.java) dan [MahasiswaDemo12.java](./sc_code/MahasiswaDemo12.java).


### 3.2.2 Verifikasi Hasil Running

![Screenshot](/img/percobaan2.png)


### 3.2.3 Pertanyaan :

1. Menambahkan method baru pada class [Mahasiswa12.java](./sc_code/Mahasiswa12.java) dan memodifikasi kode pada class [MahasiswaDemo12.java](./sc_code/MahasiswaDemo12.java).

2. Kode tersebut error dikarenakan mencoba mengakses object yang belum dibuat.


## 3.3 Percobaan 3 - Constructor Berparameter


### 3.3.1 Langkah-langkah Percobaan

Menginputkan kode sesuai perintah pada class [Matakuliah12.java](./sc_code/Matakuliah12.java) dan class [MatakuliahDemo12.java](./sc_code/MatakuliahDemo12.java).


### 3.3.2 Verifikasi Hasil Running

![Screenshot](/img/percobaan3.png)


### 3.3.3 Pertanyaan :

1. Iya dapat memiliki lebih lebih dari 1 constructor, contohnya :

![Screenshot](/img/pertanyaan1.3.png)

2. Menambahkan method cetakinfo() pada class Matakuliah12.java dan memanggil method tersebut pada class MatakuliahDemo12.java 
```java
public void tambahdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode       : ");
        kode = sc.nextLine();
        System.out.print("Nama       : ");
        nama = sc.nextLine();
        System.out.print("SKS        : ");
        sks = sc.nextInt();
        System.out.print("Jumlah Jam : ");
        jumlahjam = sc.nextInt();
        System.out.println("---------------------------------");
    }
``` 
```java
for (int i = 0; i < 3; i++){
            System.out.println("Masukkan Data Matakuliah ke-"+ (i + 1));
            arrayOfMatakuliah[i].tambahdata();
    }
```

3. Menambahkan method cetakinfo() pada class Matakuliah12.java dan memanggil method tersebut pada class MatakuliahDemo12.java
```java
public void cetakinfo() {
        System.out.println("Kode       : "+ kode);
        System.out.println("Nama       : "+ nama);
        System.out.println("SKS        : "+ sks);
        System.out.println("Jumlah Jam : "+ jumlahjam);
        System.out.println("---------------------------------");
    }
```
```java
for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-"+ (i + 1));
            arrayOfMatakuliah[i].cetakinfo();
        }
```

4. Memodifikasi kode program
```java
System.out.print("Masukkan Jumlah Matakuliah : ");
        int lengthmatkul = sc.nextInt();
        Matakuliah12[] arrayOfMatakuliah = new Matakuliah12[lengthmatkul];
```


## 3.4 Tugas


