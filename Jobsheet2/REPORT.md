|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020210|
| Nama |  Khoirul Umam Novalidi |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/novalrnv/PRAKALSD.git) |
  

# Jobsheet 2 - Object
  

## 2.1 Percobaan 1 - Deklarasi Class, Atribut, dan Method


### 2.1.1 Langkah-langkah Percobaan


Menginputkan kode program sesuai perintah pada [Mahasiswa12.java](./sc_code/Mahasiswa12.java)


### 2.1.2 Verifikasi Hasil

![Screenshot](img/verifikasi.png)


### 2.1.3 Pertanyaan :
1. Karakteristik Class : Memiliki Atribut dan Method.


	Karakteristik Object : Memiliki Identitas dan Method.

2. Atribut yang dimiliki oleh class Mahasiswa ada 4, yaitu : Nama, NIM, Kelas, dan IPK.
  

3. Methodnya ada 4, yaitu : 
	- Menampilkan Informasi.
	- Mengubah Kelas.
	- Menguodate IPK.
	- Cek Nilai Kinerja.


4. Menambahkan Syntax
```java
if (ipkbaru <= 0 || ipkbaru >= 4.0) {
        System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
    }
```

5. Kerja pada method NIlaiKinerja adalah mengevaluasi nilai kinerja Mahasiswa sesuai nilai ipk yang diperoleh dengan menggunakan beberapa kondisi untuk menentukan kinerja setiap Mahasiswa. 
Nilai yang direturnkan adalah beberapa kategori yang diperoleh dari kondisi-kondisi yang terpenuhi.

  

## 2.2 Percobaan 2 - Instansiasi Object

### 2.2.1 Langkah-langkah 

Menginputkan Kode Program sesuai perintah pada file [MahasiswaMain12.java](./sc_code/MahasiswaMain12.java)

### 2.2.2 Verifikasi Hasil

![Screenshot](img/verifikasi2.png)

### 2.2.3 Pertanyaan :

1. Baris untuk intansiasi pada class MahasiswaMain, yaitu :
```java
Mahasiswa12 mhs1 = new Mahasiswa12();
```
Object yang dihasilkan adalah bernama mhs1.

2. Untuk mengakses atribut dan method pada suatu object dengan menambahkan operator "." stelah menyebut nama object yang dimaksud.

3. Hasil output dari method tampilkaninformasi() berbeda, karena penempatan ketika pemanggilan method tersebut berbeda.  Penempatan yang pertama terdapat pada baris setleah instansiasi, sedangkan yang kedua ditempatkan setelah menginstansiasi method ubahkelas() dan updateipk().
 
## 2.3 Percobaan 3 - Membuat Konstruktor

### 2.3.1 Langkah-langkah

Menambahkan syntax pada file [Mahasiswa12.java](./sc_code/Mahasiswa12.java) dan [MahasiswaMain12.java](./sc_code/MahasiswaMain12.java)

### 2.3.2 Verifikasi Hasil

![Screenshot](img/verifikasi3.png)

### 2.3.3 Pertanyaan :

1. Baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter adalah : 
```java
public Mahasiswa12(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
```

2. Baris tersebut melakukan instansiasi pada object 'mhs2' menggunakan konstruktor berparameter.

3. Hasilnya 

![Screenshot](img/pertanyaan3.png)

Mengapa hasilnya demikian? Karena baris ke 6 di dalam file MahasiswaMain12.java dalam mengintansiasi object mhs1 tidak menggunakan parameter untuk konstruktornya, sehingga pada saat kita menghapus konstruktor default pada file Mahasiswa12.java akan menghasilkan error, Hal itu terjadi karena konstruktor yang memiliki parameter akan menjadi konstruktor default.

4. Tidak harus berurutan, Karena method dapat diakses sesuai kebutuhan.

5. Membuat object baru dengan nama mhsnoval :
```java
Mahasiswa12 mhsnoval = new Mahasiswa12("Khoirul Umam Novailid", "244107020210", 3.08, "TI 1H");
```
## 2.4 Latihan 1 Praktikum

### Mata Kuliah

1. Program ini menggunakan 2 class yaitu : [MataKuliah12.java](./sc_code/Mahasiswa12.java) dan [MataKuliahMain12.java](./sc_code/MahasiswaMain12.java)

2. Running kode program

![Screenshot](img/latihan1.1.png) ![Screenshot](img/latihan1.2.png)

3. Alur kode program :

	1.  Inisiasi Atribut dan Method pada MataKuliah12.java

	2. Mengintansiasi Object pada class MataKuliahMain12.java

	3. Manampilkan dengan menggunakan method tampilinformasi()

	4. Update jumlah jam dengan menambahkan atau mengurangi menggunakan method tambahjam() dan kurangjam()

	5. Menampilkan object 2 setelah instansiasi dengan method tampilinformasi()

	- Keterangan : Hitungan Jam menggunakan hitungan Menit


### Dosen

1. Program dalam kasus ini menggunakan 2 class yaitu : [Dosen12.java](./sc_code/Dosen12.java) dan [DosenMain12.java](./sc_code/DosenMain12.java)

2. Running kode program

![Screenshot](img/latihan2.1.png) ![Screenshot](img/latihan2.2.png)

3. Alur kode Program :

	1. Inisiasi Atribut dan Method pada class Dosen12.java

	2. Instansi Object pada class DosenMain12.java

	3. Menampilkan dengan menggunakan method tampilinformasi()

	4. Mengubah bidang jika perlu dengan menggunakan method ubahkeahlian()

	5. Menghitung masa kerja dosen yang berstatus aktif menggunakan method hitungmasa()

	6. Menampilkan object ke-2 dengan method tampilinformasi() kedua setelah instansiasi object ke-2

