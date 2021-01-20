import java.util.Objects;

public class Person implements IPerson {
    private String name;
    private int energy;
    private TypeOfWork work;

    Person(String name, TypeOfWork work) {
        this.name = name;
        this.energy = 30;
        this.work = work;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                ", work=" + work +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return energy == person.energy &&
                Objects.equals(name, person.name) &&
                work == person.work;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, energy, work);
    }

    public String getName() {
        return this.name;
    }

    public void changeWork(TypeOfWork newWork, WorkingTarget target) {
        this.work = newWork;
        if(this.work == TypeOfWork.RELAXING) {
            this.energy = 100;
            System.out.println(this.name + " отдохнул, можно за работу");
        } else {
            if(this.energy < 30){
                System.out.println(this.name + " устал, ушел отдыхать");
                WorkingTarget relax = new WorkingTarget("Отдых");
                changeWork(TypeOfWork.RELAXING, relax);
            } else {
                this.energy -= 30;
                System.out.println(getWork());
                if(this.energy == 0) {
                    System.out.println(this.name + " устал, ушел отдыхать");
                    WorkingTarget relax = new WorkingTarget("Отдых");
                    changeWork(TypeOfWork.RELAXING, relax);
                }
                target.targetDone(this.name);
            }


        }
    }

    public String getWork() {
        if(this.work == TypeOfWork.ROAD_BUILDING) {
            return this.name + " взял все нужное и пошел прокладывать дорогу";
        } else if(this.work == TypeOfWork.ELECTRICITY_BUILDING) {
            return this.name + " взял все нужное и пошел устанавливать столбы электролиний";
        } else if(this.work == TypeOfWork.FLOWERS_PLANTING) {
            return this.name + " взял все нужное и пошел сажать цветы";
        } else if(this.work == TypeOfWork.INDOOR_DECORATION) {
            return this.name + " взял все нужное и пошел заниматься внутренней отделкой дома";
        } else if(this.work == TypeOfWork.PAINTING_WORKS){
            return this.name + " руководит малярными работами:\n\t-Составляет краски \n\t-Указывает, в какие цвета красить стены и крыши домов";
        } else if(this.work == TypeOfWork.RELAXING) {
            return this.name + " бросил все и пошел отдыхать";
        } else return this.name + "";

    }

}
