fun main() {
    var emp1 = employee("Jane Doe", PositionTitle.Administration, true, 27.00, 1);
    var emp2 = employee("Larry Jackson", PositionTitle.Production, false, 22.00, 2);
    var emp3 = employee("John Smith", PositionTitle.Maintenance, false, 21.00, 3);

    emp1.display();
    emp1.calculate(45.0);
    emp2.display();
    emp2.calculate(50.0);
    emp3.display();
    emp3.calculate(35.0);

}