package com.pragma.app.domain.usecase;


/*
public class CreateRestaurantUseCase {
    private UsuarioRepository userRepository;

    public CreateRestaurantUseCase(UsuarioRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createRestaurant(String name, String nit, String address, String phoneNumber, String logoUrl, String ownerId) throws RestauranteException {
        validateFields(name, nit, address, phoneNumber, logoUrl, ownerId);
        validateOwnerRole(ownerId);

        // Logic for creating the restaurant
        Restaurante restaurant = new Restaurante(name, nit, address, phoneNumber, logoUrl, ownerId);
        // Additional actions can be performed here, such as saving the restaurant to the database or other operations related to restaurant creation
        // Example: userRepository.saveRestaurant(restaurant);
    }

    private void validateFields(String name, String nit, String address, String phoneNumber, String logoUrl, String ownerId) throws RestauranteException {
        if (name.length() > 50) {
            throw new RestauranteException("The restaurant name must have a maximum of 50 characters.");
        }

        if (!nit.matches("\\d+")) {
            throw new RestauranteException("The NIT field must be numeric.");
        }

        if (!phoneNumber.matches("[\\d+]+") || phoneNumber.length() > 13) {
            throw new RestauranteException("The phoneNumber field must be numeric and have a maximum of 13 characters.");
        }
    }

   // private void validateOwnerRole(String ownerId) throws RestauranteException {
        //"Logic for validating the owner's role based on the ownerId"
         //Example: User owner = userRepository.getUserById(ownerId);
        // if (owner == null || !owner.getRole().equals("owner")) {
             //throw new RestauranteException("The ownerId does not correspond to a user with the owner role.");
         }
    }
}
*/
