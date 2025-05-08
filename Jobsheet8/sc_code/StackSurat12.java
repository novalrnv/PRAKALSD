public class StackSurat12 {
    Surat12[] stack;
    int size, top;

    public StackSurat12(int size) {
        this.size = size;
        stack = new Surat12[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat12 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
            System.out.println("Surat berhasil diterima.");
        } else {
            System.out.println("Stack penuh, tidak bisa menerima surat baru.");
        }
    }

    public Surat12 pop() {
        if (!isEmpty()) {
            Surat12 surat = stack[top];
            top--;
            System.out.println("Surat diproses : " + surat.namamahasiswa);
            return surat;
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat12 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat yang tersisa.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namamahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan : ");
                System.out.println("ID : " + stack[i].idsurat + "\nNama : " + stack[i].namamahasiswa + "\nJenis Izin : " + stack[i].jenisizin);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dengan nama tersebut tidak ditemukan.");
        }
    }
}
