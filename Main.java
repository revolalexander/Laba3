public class Main {

    public static void main(String[] args) {
        System.out.println("\n\n");
        WorkingTarget road = new WorkingTarget("Дорога");
        WorkingTarget electricity = new WorkingTarget("Линия электропередач");
        WorkingTarget flowers = new WorkingTarget("Цветы");
        WorkingTarget decoration = new WorkingTarget("Внутренняя отделка дома");
        WorkingTarget paint = new WorkingTarget("Малярные работы");

        Person knownothing = new Person("Незнайка", TypeOfWork.NOTHING);
        System.out.println(knownothing.getName() + " пришел на стройку\nУ него был такой вид, будто он всю жизнь только тем и занимался, что строил космические городки\n");

        Person citizenNikita = new Person("Житель Цветочного города Никита", TypeOfWork.NOTHING);
        System.out.println(citizenNikita.getName() + " пришел на стройку");
        citizenNikita.changeWork(TypeOfWork.ROAD_BUILDING, road);

        Person citizenAlexey = new Person("Житель Цветочного города Леха", TypeOfWork.NOTHING);
        System.out.println(citizenAlexey.getName() + " пришел на стройку");
        citizenAlexey.changeWork(TypeOfWork.ELECTRICITY_BUILDING, electricity);

        Person citizenArseniy = new Person("Житель Цветочного города Сеня", TypeOfWork.NOTHING);
        System.out.println(citizenArseniy.getName() + " пришел на стройку");
        citizenArseniy.changeWork(TypeOfWork.FLOWERS_PLANTING, flowers);

        Person citizenLesya = new Person("Житель Цветочного города Леся", TypeOfWork.NOTHING);
        System.out.println(citizenLesya.getName() + " пришел на стройку");
        citizenLesya.changeWork(TypeOfWork.INDOOR_DECORATION, decoration);

        Person tubik = new Person("Тюбик", TypeOfWork.NOTHING);
        System.out.println(tubik.getName() + " пришел на стройку");
        tubik.changeWork(TypeOfWork.PAINTING_WORKS, paint);


    }
}
