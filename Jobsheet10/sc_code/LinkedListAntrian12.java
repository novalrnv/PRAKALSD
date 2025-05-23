package sc_code;

public class LinkedListAntrian12 {
    NodeMhs12 head;
    NodeMhs12 tail;
    int maxSize;

    LinkedListAntrian12(int maxSize) {
        head = null;
        tail = null;
        this.maxSize = maxSize;
    }

    public int getSize() {
        NodeMhs12 temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return getSize() == maxSize;
    }

    public void kosongkanAntrian() {
        head = null;
        tail = null;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void tambahAntrian(Mahasiswa data) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
            return;
        }
        NodeMhs12 temp = new NodeMhs12(data);
        if (isEmpty()) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        System.out.println("Mahasiswa berhasil ditambahkan");
    }

    public void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        head.data.tampilInformasi();
        head = head.next;
        System.out.println("Memproses 1 antrian");
        System.out.println("Nama\tKelas\tNIM\tIPK");
        head.data.tampilInformasi();
    }

    public void tampilTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("Mahasiswa terdepan dalam antrian: ");
        System.out.println("Nama\tKelas\tNIM\tIPK");
        head.data.tampilInformasi();
    }

    public void tampilBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("Mahasiswa terbelakang dalam antrian: ");
        System.out.println("Nama\tKelas\tNIM\tIPK");
        tail.data.tampilInformasi();
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        NodeMhs12 temp = head;
        System.out.println("== Data Antrian Mahasiswa ==");
        System.out.println("Nama\tKelas\tNIM\tIPK");
        do {
            temp.data.tampilInformasi();
            temp = temp.next;
        } while (temp != null);
    }
}
