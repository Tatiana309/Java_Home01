package home09;

public class Home09 {
    public static void main(String[] args) {
        Department generalDirector = new Department(1,"Генеральный директор");
        Department salesDirectorate = new Department(5,"Дирекция по продажам",generalDirector);
        Department salesDepartment = new Department(15,"Отдел продаж",salesDirectorate);
        Department prDepartment = new Department(7,"Отдел рекламы и PR",salesDirectorate);
        Department economicsDirectorate = new Department(6,"Дирекция по экономике и финансам",generalDirector);
        Department hrDepartment = new Department(10,"Отдел кадров",economicsDirectorate);
        Department accounting = new Department(13,"Бухгалтерия",economicsDirectorate);
        System.out.println(generalDirector.Info());
        System.out.println(salesDirectorate.Info());
        System.out.println(salesDepartment.Info());
        System.out.println(prDepartment.Info());
        System.out.println(economicsDirectorate.Info());
        System.out.println(hrDepartment.Info());
        System.out.println(accounting.Info());
    }
}
