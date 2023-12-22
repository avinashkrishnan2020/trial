package OOP;

public class Child extends Father{

    private String schoolName;
    private boolean isVaccinated;


    public Child(String name, int age, String schoolName, boolean isVaccinated){
        super(name, age);
        this.schoolName = schoolName;
        this.isVaccinated = isVaccinated;
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public void setIsVaccinated(boolean isVaccinated){
        this.isVaccinated = isVaccinated;
    }

    public String getSchoolName(){
        return this.schoolName;
    }

    public boolean getIsVaccinated(){
        return isVaccinated;
    }

    @Override
    public String toString(){
        return "{"+ this.getName() + " " + this.getAge() + " " + this.getSchoolName() + "}";
    }
}
