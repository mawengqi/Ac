package acuser.test

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/31
 */
@DBDocument
abstract class People extends DataObject{
    @DocumentField(key = "name")
    private String name;
    @DocumentField(key = "age")
    private int age;
    @DocumentField(key = "sex")
    private String sex;

    People() {
    }

    People(String name, int age, String sex) {
        this.name = name
        this.age = age
        this.sex = sex
    }

    Document toDocument(){
        Document document = new Document()
        document.append("name", name)
                .append("age", age)
                .append("sex", sex)
        return document
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    int getAge() {
        return age
    }

    void setAge(int age) {
        this.age = age
    }

    String getSex() {
        return sex
    }

    void setSex(String sex) {
        this.sex = sex
    }
}
