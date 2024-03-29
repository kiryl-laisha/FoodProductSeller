package by.itacademy.laisha.foodproductseller.services;

import by.itacademy.laisha.foodproductseller.account.AccountDatabase;
import by.itacademy.laisha.foodproductseller.enums.FoodProductClasses;
import by.itacademy.laisha.foodproductseller.enums.VehicleTypes;
import by.itacademy.laisha.foodproductseller.utils.*;

public class Manager {

    public static void loadDatabases() {

        Logger.log("Entered the method Manager.loadDatabases();");
        Warehouse.loadWarehouseDatabases();
        Transport.loadTransportDatabases();
        Logger.log("Exited the method Manager.loadDatabases();");
    }

    public static void workInMainMenu() {

        Logger.log("Entered the method Manager.workInMainMenu();");
        exit:
        {
            while (true) {
                mainMenu:
                {
                    ScreenUtils.printFramedString(
                            " Menu of the \"Food product Seller\".\n" +
                                    " Please, choice your action:\n" +
                                    " 1 - Warehouse;\n" +
                                    " 2 - Transport;\n" +
                                    " 3 - Exit;");
                    switch (MenuUtils.getSelectedItem(3)) {
                        case 1:
                            while (true) {
                                warehouseMenu:
                                {
                                    ScreenUtils.printFramedString(
                                            " A warehouse of the \"Food product Seller\".\n" +
                                                    " Please, choice your action:\n" +
                                                    " 1 - View a class \"Coffee\";\n" +
                                                    " 2 - View a class \"Tea\";\n" +
                                                    " 3 - View a class \"Water\";\n" +
                                                    " 4 - Form an order;\n" +
                                                    " 5 - Back;");
                                    switch (MenuUtils.getSelectedItem(5)) {
                                        case 1:
                                            while (true) {
                                                coffeeMenu:
                                                {
                                                    ScreenUtils.printFramedString(
                                                            " The class \"Coffee\".\n" +
                                                                    " Please, choice your action:\n" +
                                                                    " 1 - View class positions;\n" +
                                                                    " 2 - The class menu \"Adding\";\n" +
                                                                    " 3 - The class menu \"Sorting\";\n" +
                                                                    " 4 - Back;");
                                                    switch (MenuUtils.getSelectedItem(4)) {
                                                        case 1:
                                                            ScreenUtils.printCoffeesTable(
                                                                    " The class \"Coffee\" positions.",
                                                                    (WarehouseUtils.getCoffees()));
                                                            break;
                                                        case 2:
                                                            while (true) {
                                                                ScreenUtils.printFramedString(
                                                                        " The class \"Coffee\" menu \"Adding\".\n" +
                                                                                " Please, choice your action:\n" +
                                                                                " 1 - Add a new class type position;\n" +
                                                                                " 2 - Add a new class type ;\n" +
                                                                                " 3 - Back;");
                                                                switch (MenuUtils.getSelectedItem(3)) {
                                                                    case 1:
                                                                        FoodProductUtils.addFoodProductPosition(
                                                                                FoodProductClasses.COFFEE.getProductClass());
                                                                        break;
                                                                    case 2:
                                                                        FoodProductUtils.addFoodProductType(
                                                                                FoodProductClasses.COFFEE.getProductClass());
                                                                        break;
                                                                    case 3:
                                                                        break coffeeMenu;
                                                                }
                                                            }
                                                        case 3:
                                                            MenuUtils.choiceCoffeeClassSorting("",
                                                                    WarehouseUtils.getCoffees());
                                                            break coffeeMenu;
                                                        case 4:
                                                            break warehouseMenu;
                                                    }
                                                }
                                            }
                                        case 2:
                                            ScreenUtils.printStrip();
                                            ScreenUtils.printString("Unfortunately, the class \"Tea\" " +
                                                    "has not been developed yet.");
                                            break;
                                        case 3:
                                            ScreenUtils.printStrip();
                                            ScreenUtils.printString("Unfortunately, the class \"Water\" " +
                                                    "has not been developed yet.");
                                            break;
                                        case 4:
                                            WarehouseUtils.formOrder();
                                            break;
                                        case 5:
                                            break mainMenu;
                                    }
                                }
                            }
                        case 2:
                            while (true) {
                                transportMenu:
                                {
                                    ScreenUtils.printFramedString(
                                            " A transport of the \"Food product Seller\".\n" +
                                                    " Please, choice your action:\n" +
                                                    " 1 - View a type \"Cargovan\";\n" +
                                                    " 2 - View a type \"Minivan\";\n" +
                                                    " 3 - View a type \"Car\";\n" +
                                                    " 4 - Back;");
                                    switch (MenuUtils.getSelectedItem(4)) {
                                        case 1:
                                            while (true) {
                                                cargovanMenu:
                                                {
                                                    ScreenUtils.printFramedString(
                                                            " The type \"Cargovan\".\n" +
                                                                    " Please, choice your action:\n" +
                                                                    " 1 - View type positions;\n" +
                                                                    " 2 - The type menu \"Adding\" and \"Editing\";\n" +
                                                                    " 3 - The type menu \"Sorting\";\n" +
                                                                    " 4 - Back;");
                                                    switch (MenuUtils.getSelectedItem(4)) {
                                                        case 1:
                                                            ScreenUtils.printCargovansTable(
                                                                    " The type \"Cargovan\" positions.",
                                                                    (TransportUtils.getCargovans()));
                                                            break;
                                                        case 2:
                                                            while (true) {
                                                                ScreenUtils.printFramedString(
                                                                        " The type \"Cargovan\" menu " +
                                                                                "\"Adding\" and \"Editing\".\n" +
                                                                                " Please, choice your action:\n" +
                                                                                " 1 - Add a new type position;\n" +
                                                                                " 2 - Edit an exist type position;\n" +
                                                                                " 3 - Back;");
                                                                switch (MenuUtils.getSelectedItem(3)) {
                                                                    case 1:
                                                                        TransportUtils.addVehiclePosition(
                                                                                VehicleTypes.CARGOVAN.getVehicleType());
                                                                        break;
                                                                    case 2:
                                                                        ScreenUtils.printStrip();
                                                                        ScreenUtils.printString("Unfortunately, this " +
                                                                                "chapter has not been developed yet.");
                                                                        break;
                                                                    case 3:
                                                                        break cargovanMenu;
                                                                }
                                                            }
                                                        case 3:
                                                            ScreenUtils.printStrip();
                                                            ScreenUtils.printString("Unfortunately, this " +
                                                                    "chapter has not been developed yet.");
                                                            break;
                                                        case 4:
                                                            break transportMenu;
                                                    }
                                                }
                                            }
                                        case 2:
                                            ScreenUtils.printStrip();
                                            ScreenUtils.printString("Unfortunately, the type \"Minivan\" " +
                                                    "has not been developed yet.");
                                            break;
                                        case 3:
                                            ScreenUtils.printStrip();
                                            ScreenUtils.printString("Unfortunately, the type \"Car\" " +
                                                    "has not been developed yet.");
                                            break;
                                        case 4:
                                            break mainMenu;
                                    }
                                }
                            }
                        case 3:
                            break exit;
                    }
                }
            }
        }
        Logger.log("Exited the method Manager.workInMainMenu();");
    }


    public static void saveDatabases() {

        Logger.log("Entered the method Manager.saveDatabases();");
        Warehouse.saveWarehouseDatabases();
        Transport.saveTransportDatabases();
        Logger.log("Exited the method Manager.saveDatabases();");

    }

    public static void parting() {

        ScreenUtils.printFramedString("Good bye, " + AccountDatabase.account.getUserAccountName() +
                "! Come back for more, please.");
    }
}





