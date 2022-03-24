package pl.manczak.ksb2api.api;


import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dogs")
public class DogApi {

    private List<Dog> dogList;

    public DogApi(){
        this.dogList=new ArrayList<>();
        dogList.add(new Dog("Baksik","Husky"));
        dogList.add(new Dog("Reksio","Chow Chow"));
        dogList.add(new Dog("Burek","Samoyed "));
    }

    public List<Dog> get(@RequestHeader int amount){
        return dogList.subList(0,amount);

    }
}
