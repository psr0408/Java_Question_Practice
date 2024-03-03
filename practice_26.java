class myMaEmploy {
    private int id;
    private String name;

    public myMaEmploy() {
        id = 4455;
        name = "Sushant";
    }

    public myMaEmploy(int i, String mName) {
        id = i;
        name = mName;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class practice_26 {
    public static void main(String[] args) {
        myMaEmploy pr = new myMaEmploy(0, null);
        myMaEmploy pr2 = new myMaEmploy();
        myMaEmploy pr1 = new myMaEmploy(45, "prashant");
        pr.setId(455);
        pr.setName("Prashant");
        System.out.println(pr.getId());
        System.out.println(pr.getName());
        System.out.println(pr1.getId());
        System.out.println(pr1.getName());
        System.out.println(pr2.getId());
        System.out.println(pr2.getName());
    }
}
