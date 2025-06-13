
|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020210|
| Nama |    KHOIRUL UMAM NOVALIDI |
| Kelas | TI - 1H |
| Repository | [link] (https://github.com/Calon-raja-ngoding/PADSD.git) |

# 12.1 Double Linked Lists

## 12.2.1 Percobaan 1
**Penjelasan :**
  Terdapat 4 file yaitu :
 - [Mahasiswa12.java](sc_code/Mahasiswa12.java)
 - [Node12.java](sc_code/Node12.java)
 - [DoubleLinkedList12.java](sc_code/DoubleLinkedList12.java)
 - [DLLMain12.java](sc_code/DLLMain12.java)

  **Verivikasi Hasil!** 
  
 ![Screenshot](img/Screenshot%202025-05-25%20003206.png)	

  **Pertanyaan :**
  1. Perbedaan Single Linked List dan Double Linked List terletak pada jumlah pointernya, Single Linked List hanya memiliki satu pointer yaitu pointer `next` berguna untuk ke node selanjutnya, sedangkan Double Linked List ada dua yaitu pointer `next` dan `prev` berguna untuk ke node selanjut atau sebelumnya.
 2.  Atribut `next` digunakan untuk menunjuk ke node berikutnya, sedangkan `prev` digunakan untuk menunjuk ke node sebelumnya. Keduanya memungkinkan traversal data dalam dua arah pada struktur double linked list.

 3. Konstruktor `DoubleLinkedlist18()` berfungsi untuk menginisialisasi linked list saat pertama kali dibuat dan menandakan bahwa linked list masih kosong. Dengan menetapkan `head` dan `tail` ke `null`.
 4. Kode tersebut digunakan ntuk Menambahkan data pertama kali saat list masih kosong.
5. Statement `head.prev = newNode;` digunakan sebagai penghubung `newNode` ke node sebelum `head`.
6.  Modifikasi kode program menjadi seperti berikut:

	    public  void  print(){
		    if (!isEmpty()) {
			    Node12  current  =  head;
			    while (current  !=  null) {
				    current.data.tampil();
				    current  =  current.next;
			    }
		    }else{
			    System.out.println("List kosong, tidak bisa menampilkan.");
		    }
	    }

7.  Kode `current.next.prev = newNode;` digunakan untuk mengatur `newNode` sebagai node sebelumnya dari node yang berada setelah `current` sebelum diubah.
8. Hasil Modifikasi:

 ![Screenshot](img/Screenshot%202025-05-25%20003944.png)	
***
## 12.3.1 Tahapan Percobaan 2

**Penjelasan :**
  Pada percobaan ke 2 ini hanya menambahkan beberapa method.
  **Verivikasi Hasil!** 
 ![Screenshot](img/Screenshot%202025-05-25%20004412.png)	
  
  **Pertanyaan :**
  1. Kedua baris itu digunakan untuk menghapus node pertama dari double linked list dan memastikan hubungan dua arah tetap konsisten.
2. Hasil Modifikasi:

 ![Screenshot](img/Screenshot%202025-05-25%20004453.png)
 ***

## 12.4.Tugas 
![Screenshot](img/Screenshot%202025-05-25%20013659.png)

![Screenshot](img/Screenshot%202025-05-25%20013726.png) 

![Screenshot](img/Screenshot%202025-05-25%20013753.png) 

![Screenshot](img/Screenshot%202025-05-25%20013825.png) 

![Screenshot](img/Screenshot%202025-05-25%20013846.png)

![Screenshot](img/Screenshot%202025-05-25%20013905.png) 
***

***
## Terima Kasih :)
