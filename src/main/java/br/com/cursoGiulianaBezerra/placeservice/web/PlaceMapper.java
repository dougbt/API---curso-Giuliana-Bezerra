package br.com.cursoGiulianaBezerra.placeservice.web;

import br.com.cursoGiulianaBezerra.placeservice.api.PlaceResponse;
import br.com.cursoGiulianaBezerra.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place){
        return new PlaceResponse(place.name(), place.slug(), place.state(), place.createdAt(), place.updatedAt());
    }
}
