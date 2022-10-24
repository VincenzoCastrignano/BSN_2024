![google_map_test2](https://user-images.githubusercontent.com/91130147/197532512-7767fc19-ab64-4c18-a8c2-ac00782ed59c.PNG)
![google_map_test](https://user-images.githubusercontent.com/91130147/197531819-e84af789-de07-45ed-8cc9-6d77c3671907.PNG)
## Test API google map on Android Studio 


### Suite au tuto, j'ai pu ajouter l'API de Google Map sur Android Studio.

### Quelques lignes de code : 

## Cette ligne désigne le fait d'ajouter le service de localisation sur l'app.

    implementation 'com.google.android.gms:play-services-location:21.0.0'


## Insertion de l'API


android:name="com.google.android.geo.API_KEY"
android:value="AIzaSyDgRgqQz9ev7TJj4PhzE2Q7AlgscBHD5N4" />


## Fonction encore en dev, permet d'avoir la localisation user ainsi que la derniere dispo sur l'appli : 

    private fun getCurrentLocationUser() {
    if(ActivityCompat.checkSelfPermission(
    this,android.Manifest.permission.ACCESS_FINE_LOCATION)!=
    PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
    this,android.Manifest.permission.ACCESS_COARSE_LOCATION)!=
    PackageManager.PERMISSION_GRANTED){
    
                ActivityCompat.requestPermissions(this,
                    arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),permissionCode)
                return
            }
    
            val getLocation= fusedLocationProviderClient.lastLocation.addOnSuccessListener{
                    location ->
    
                    if(location != null){
    
                        currentLocation =location
    
                        Toast.makeText(applicationContext,currentLocation.latitude.toString()+ "" +
                                currentLocation.longitude.toString(), Toast.LENGTH_LONG).show()
    
                        val mapFragment = supportFragmentManager
                            .findFragmentById(R.id.map) as SupportMapFragment
                        mapFragment.getMapAsync(this)
    
                    }
            }


## enfin derniere fonction qui permettra d'afficher la localisation 

    override fun onMapReady(googleMap: GoogleMap) {
    
            val latLng =LatLng(currentLocation.latitude , currentLocation.longitude)
            val markerOptions= MarkerOptions().position(latLng).title("Current location")
    
            googleMap?.animateCamera(CameraUpdateFactory.newLatLng(latLng))
            googleMap?.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 7f))
            googleMap?.addMarker(markerOptions)
    
        }
