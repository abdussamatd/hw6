package FurnitureFactory;

import FurnitureFactory.ArtDeco.ArtDecoTeam;
import FurnitureFactory.Modern.ModernTeamFactory;
import FurnitureFactory.Victorian.VicTeamFactory;

public class FurnitureFactory {

    public static void main(String[] args) {
        ProjectTeamFactory projectTF = new ArtDecoTeam();
        AbstractFactory abstracT = projectTF.getFactory();
        FurnitureTester ftest = projectTF.getTester();

        FactoryManager fmanager = projectTF.getManager();

        System.out.println("art deco created");

        abstracT.createChair(); abstracT.createSofa(); abstracT.createCoffeeTable();
        ftest.testfurniture();
        fmanager.manageProject();

        ProjectTeamFactory projectTF2 = new ModernTeamFactory();

        AbstractFactory abs2 = projectTF2.getFactory();

        FurnitureTester ftester1 = projectTF2.getTester();

        FactoryManager fmanager1 = projectTF2.getManager();

        System.out.println("Modern furnitures created");

        abs2.createCoffeeTable(); abs2.createSofa(); abs2.createChair();

        ftester1.testfurniture(); fmanager1.manageProject();




        ProjectTeamFactory project3 = new VicTeamFactory();

        AbstractFactory abs3 = project3.getFactory();

        FurnitureTester ftester2 = project3.getTester();

        FactoryManager fmanager2 = project3.getManager();

        System.out.println(" Victorian created");

        abs3.createChair(); abs3.createSofa(); abs3.createCoffeeTable();

        ftester2.testfurniture(); fmanager2.manageProject();


    }
}
