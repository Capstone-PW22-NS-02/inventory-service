//package com.capstone.inventoryservice;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class InventoryConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(ProductRepository repository){
//        return args -> {
//            repository.saveAll(
//                    List.of(
//                            new Product(
//                            "Asus Vivobook 15",
//                            "Best laptop",
//                            60000,
//                            4.5
//                        ),
//                            new Product(
//                                    "Mi 10i",
//                                    "Best mobile",
//                                    20000,
//                                    4.7
//                            )
//                    )
//            );
//        };
//    }
//}
