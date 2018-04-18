package cn.tx.set;

public class Persion implements Comparable<Persion> {
    private Integer age;
    private String name;

    public int compareTo(Persion o){
        if( this.name.equals(o.name) ){
            return this.age.compareTo(o.age);
        }
        return this.name.compareTo(o.name);
    }

    public Persion() {
    }

    public Persion(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persion persion = (Persion) o;

        if (age != persion.age) return false;
        return name != null ? name.equals(persion.name) : persion.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "{age=" + age +
                ", name='" + name + '\''+"}";
    }

}
