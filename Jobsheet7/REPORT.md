
|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020210 |
| Nama |  KHOIRUL UMAM NOVALIDI |
| Kelas | TI - 1H |
| Repository | [link](https://github.com/novalrnv/PRAKALSD.git) |
# Searching / Pencarian Menggunakan Agoritma Sequential Search
## 7.2 Mengimplementasikan Sorting menggunakan object

 ![Screenshot](/jobsheet7/img/Screenshot%202025-03-28%20181514.png)
***
**Penjelesan singkat:** 
Disini ada 3 step utama: 
#### **1. Membuat Class `Mahasiswa12`**
#### **2. Membuat Class `MahasiswaBerprestasi12`**
#### **3. Membuat Class `MahasiswaDemo12`**
 ***
  **Pertanyaan :**
  1. **Jelaskan perbedaan metod tampil`DataSearch` dan `tampilPosisi` pada class**
	   - Metode `tampilPosisi` digunakan untuk menampilkan posisi (indeks) data mahasiswa berdasarkan IPK yang dicari, sedangkan `tampilDataSearch` digunakan untuk menampilkan detail data mahasiswa (seperti NIM, nama, kelas, dan IPK) dari posisi tersebut.
 2. **Jelaskan fungsi break pada kode program dibawah ini!**

	    if (listMhs[i].ipk  ==  cari) {
	    posisi  =  i;
	    break;
	    }
	- Fungsi `break` pada kode tersebut digunakan untuk **menghentikan perulangan secara langsung** saat data yang dicari (IPK) sudah ditemukan, sehingga program tidak perlu melanjutkan pencarian ke elemen berikutnya yang tidak diperlukan lagi..
***
## 7.3 Searching / Pencarian Menggunakan Binary Search


 ![Screenshot](/jobsheet7/img/Screenshot%202025-03-28%20142332.png)
 
![Screenshot](/jobsheet7/img/Screenshot%202025-03-28%20142350.png)	
***
**Penjelesan singkat:** 
Disini ada 2 step utama: 
1.  **Menambahkan Fitur pencarian Binary Search**
2.  **Menambahkan code untuk menjalankan fitur yg diata di `MahasiswaDemo12`**
    ***
  **Pertanyaan :**
  1. **Tunjukkan pada kode program yang mana proses divide dijalankan!**
	
		-	mid  = (left  +  right) /  2;

 2. **Tunjukkan pada kode program yang mana proses conquer dijalankan!**

	- 		if (cari  ==  listMhs[mid].ipk){
				   return (mid);
			    }else  if (listMhs[mid].ipk  >  cari) {
			   	   return  findBinarySearch(cari, left, mid  -  1);
			    }else{
				   return  findBinarySearch(cari, mid  +  1, right);
		    }
3. **Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian!**
	- Program tetap bisa berjalan meskipun data IPK tidak diurutkan, namun hasil pencarian menggunakan binary search bisa salah karena metode ini hanya bekerja dengan benar pada data yang sudah terurut.
4. **Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (missal : 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai**
	- Jika data IPK dimasukkan dari yang terbesar ke terkecil, maka binary search pada kode tersebut tidak akan menghasilkan hasil yang sesuai, karena kode program findBinarySearch saat ini dirancang untuk data yang diurutkan secara ascending, agar sesuai modifikasi sedikit method findBinarySearch() seperti kode  dibawah :

		    int findBinarySearch(double cari, int left, int right) {
    			if (right >= left) {
        			int mid = (left + right) / 2;
        			if (listMhs[mid].ipk == cari) {
            			return mid;
        			} else if (listMhs[mid].ipk < cari) {
            			return findBinarySearch(cari, left, mid - 1);
        			} else {
            			return findBinarySearch(cari, mid + 1, right);
        			}
    			}
    			return -1;
			}

	-  ![Screenshot](/jobsheet7/img/Screenshot%202025-03-28%20152059.png)
 5. **Modifikasilah program diatas yang mana jumlah mahasiswa yang di inputkan sesuai dengan masukan dari keyboard.**
	-  ![Screenshot](/jobsheet7/img/Screenshot%202025-03-28%20161452.png)
***
## Tugas 1

 ![Screenshot](/jobsheet7/img/Screenshot%202025-03-28%20175058.png)

 ![Screenshot](/jobsheet7/img/Screenshot%202025-03-28%20175115.png)

***
**Penjelesan singkat:** 
Disini ada 4 step utama: 
1.  **Buat class `Dosen`**
2.  **Buat class `DataDosen`**
3.  **Buat class `DosenMain`**
4.  **Uji Coba**
***
## Terima Kasih :)

