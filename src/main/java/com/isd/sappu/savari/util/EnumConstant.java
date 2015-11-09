package com.isd.sappu.savari.util;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class EnumConstant {

	public enum YesNoStatus {
		YES(1), NO(0);

		private int code;

		private YesNoStatus(int code) {
			this.code = code;
		}

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}

		private static final Map<Integer, YesNoStatus> LOOKUP = new HashMap<Integer, YesNoStatus>();

		static {
			for (YesNoStatus yesNoStatus : EnumSet.allOf(YesNoStatus.class)) {
				LOOKUP.put(yesNoStatus.getCode(), yesNoStatus);
			}
		}

		public static YesNoStatus fromCode(int code) {
			return LOOKUP.get(code);
		}

	}
	
	public enum ReturnStatus {
		
		SUCCESS("SUCCESS"), ERROR("ERROR");

		private String displayName;

		private ReturnStatus(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, ReturnStatus> LOOKUP = new LinkedHashMap<String, ReturnStatus>();
		private static final Map<String, ReturnStatus> CODE_LOOKUP = new LinkedHashMap<String, ReturnStatus>();

		static {
			for (ReturnStatus returnStatus : EnumSet.allOf(ReturnStatus.class)) {
				LOOKUP.put(returnStatus.getDisplayName(), returnStatus);
				CODE_LOOKUP.put(returnStatus.toString(), returnStatus);
			}
		}
		
		public static ReturnStatus fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static ReturnStatus fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, ReturnStatus> getMap(){
			return LOOKUP;
		}

	}
	
	public enum Role {
		
		ROLE_ADMIN("Admin"), ROLE_USER("User");

		private String displayName;

		private Role(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, Role> LOOKUP = new LinkedHashMap<String, Role>();
		private static final Map<String, Role> CODE_LOOKUP = new LinkedHashMap<String, Role>();

		static {
			for (Role role : EnumSet.allOf(Role.class)) {
				LOOKUP.put(role.getDisplayName(), role);
				CODE_LOOKUP.put(role.toString(), role);
			}
		}
		
		public static Role fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static Role fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, Role> getMap(){
			return LOOKUP;
		}

	}

	public enum MobileBrand {

		ACER("Acer"), ALCATEL("Alcatel"), AMOI("Amoi"), APPLE("Apple"), ASUS("Asus"),BENQ("Benq"), BLACKBERRY("Black berry"), BIRD("Bird"), CASIO("Casio"), DELL("Dell"), ERICSSON("Ericsson"), 
		GIGABYTE("Gigabyte"), HAIER("Haier"), HP("Hp"), INTEX("Intex"), LAVA("Lava"), LENOVA("Lenova"), KARBON("Karbon"), LG("LG"), MICROSOFT("Microsoft"),MICROMAX("Micromax"), MODU("Modu"), 
		MOTOROLLA("Motorolla"), NEC("Nec"), NOKIA("Nokia"), NVIDIA("Nvidia"), O2("O2"), ONEPLUS("OnePlus"), OPPO("Oppo"), ORANGE("Orange"), PANASONIC("Panasonic"), PHILIPS("Philips"), POSH("Posh"), 
		SAMSUNG("Samsung"), SHARP("Sharp"), SIEMENS("Siemens"),SONYERICCSON("Sony Ericcson"), TMOBILE("Tmobile"), TOSHIBA("Toshiba"), VIVO("Vivo"), VODAFONE("Vodafone"), XOLO("Xolo"), ZTE("ZTE"), OTHER("Other");

		private String displayName;

		private MobileBrand(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, MobileBrand> LOOKUP = new LinkedHashMap<String, MobileBrand>();
		private static final Map<String, MobileBrand> CODE_LOOKUP = new LinkedHashMap<String, MobileBrand>();

		static {
			for (MobileBrand mobileBrand : EnumSet.allOf(MobileBrand.class)) {
				LOOKUP.put(mobileBrand.getDisplayName(), mobileBrand);
				CODE_LOOKUP.put(mobileBrand.toString(), mobileBrand);
			}
		}
		
		public static MobileBrand fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static MobileBrand fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, MobileBrand> getMap(){
			return LOOKUP;
		}
		
	}
	
	public enum TVBrand {

		HAIER("Haier"), INNOVEX("Innovex"), JVC("JVC"), LG("LG"), NEC("NEC"),PANASONIC("Panasonic"), PHILIPS("Philips"), SAMSUNG("Samsun"), SANSUI("Sansui"), SONY("Sony"), TOSHIBA("Toshiba"), OTHER("Other");

		private String displayName;

		private TVBrand(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, TVBrand> LOOKUP = new LinkedHashMap<String, TVBrand>();
		private static final Map<String, TVBrand> CODE_LOOKUP = new LinkedHashMap<String, TVBrand>();

		static {
			for (TVBrand tvBrand : EnumSet.allOf(TVBrand.class)) {
				LOOKUP.put(tvBrand.getDisplayName(), tvBrand);
				CODE_LOOKUP.put(tvBrand.toString(), tvBrand);
			}
		}
		
		public static TVBrand fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static TVBrand fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, TVBrand> getMap(){
			return LOOKUP;
		}
		
	}
	
	public enum ComputerBrand {

		ACER("Acer"), APPLEIMAC("Apple iMac"), APPLEMACBOOK("Apple MacBook"), ASUS("Asus"), DELL("Dell"),HP("HP"), IBM("IBM"), INTEL("Intel"), LENOVA("Lenova"), 
		PANASONIC("Panasonic"), SAMSUNG("Samsung"), SONY("Sony"), TOSHIBA("Toshiba"), OTHER("Other");

		private String displayName;

		private ComputerBrand(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, ComputerBrand> LOOKUP = new LinkedHashMap<String, ComputerBrand>();
		private static final Map<String, ComputerBrand> CODE_LOOKUP = new LinkedHashMap<String, ComputerBrand>();

		static {
			for (ComputerBrand computerBrand : EnumSet.allOf(ComputerBrand.class)) {
				LOOKUP.put(computerBrand.getDisplayName(), computerBrand);
				CODE_LOOKUP.put(computerBrand.toString(), computerBrand);
			}
		}
		
		public static ComputerBrand fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static ComputerBrand fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, ComputerBrand> getMap(){
			return LOOKUP;
		}
		
	}
	
	public enum CameraBrand {

		CANON("Canon"), FUJIFILM("Fujifilm"), KODAK("Kodak"), KONIKA("Konika"), NIKON("Nikon"), OLYMPUS("Olympus"),
		PENTAX("Pentax"), SAMSUNG("Samsung"), SONY("Sony"), TOSHIBA("Toshiba"), OTHER("Other");

		private String displayName;

		private CameraBrand(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, CameraBrand> LOOKUP = new LinkedHashMap<String, CameraBrand>();
		private static final Map<String, CameraBrand> CODE_LOOKUP = new LinkedHashMap<String, CameraBrand>();

		static {
			for (CameraBrand cameraBrand : EnumSet.allOf(CameraBrand.class)) {
				LOOKUP.put(cameraBrand.getDisplayName(), cameraBrand);
				CODE_LOOKUP.put(cameraBrand.toString(), cameraBrand);
			}
		}
		
		public static CameraBrand fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static CameraBrand fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, CameraBrand> getMap(){
			return LOOKUP;
		}
		
	}
	
	public enum CarBrand {

		ALFAROMEO("AlfarRomeo"), ASTONMARTIN("Aston Martin"), AUDI("Audi"), AUSTIN("Austin"), BMW("BMW"), CADILLAC("Cadillac"), CHANGAN("Changan"), CHERY("Chery"), 
		CHEVERLOT("Cheverlot"), CHRYSLER("Chrysler"), DAEWOO("Daewoo"), DAIHATSU("Daihatsu"),DATSUN("Datsun"), DODGE("Dodge"), FERRARI("Ferrari"), FIAT("Fiat"), 
		FORD("Ford"), GEELY("Geely"), GMC("GMC"), HINO("Hino"), HONDA("Honda"), HUMMER("Hummer"), HYUNDAI("Hyundai"), ISUZU("Isuzu"), JAGUAR("Jaguar"), JEEP("Jeep"), 
		KIA("Kia"), LAMBORGHINI("Lamborghini"), LANDROVER("Landrover"), LEXUS("Lexus"), LINCOLN("Lincoln"), MAHINDRA("Mahindra"), MARUTI("Maruti"), MAZDA("Mazda"), 
		MERCEDESBENZ("Mercedes Benz"), MG("MG"), MICRO("Micro"), MINI("Mini"), MITSUBISHI("Mitsubishi"), MORRIS("Morris"), NISSAN("Nissan"),PERODUA("Perodua"), 
		PORSCHE("Porsche"), PROTON("Proton"), RENAULT("Renault"), SSANGYONG("Ssang Yong"), SUBARU("Subaru"), SUZUKI("Suzuki"), TATA("Tata"), TOYOTA("Toyota"), 
		VOLVO("Volvo"), OTHER("Other");

		private String displayName;

		private CarBrand(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, CarBrand> LOOKUP = new LinkedHashMap<String, CarBrand>();
		private static final Map<String, CarBrand> CODE_LOOKUP = new LinkedHashMap<String, CarBrand>();

		static {
			for (CarBrand carBrand : EnumSet.allOf(CarBrand.class)) {
				LOOKUP.put(carBrand.getDisplayName(), carBrand);
				CODE_LOOKUP.put(carBrand.toString(), carBrand);
			}
		}
		
		public static CarBrand fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static CarBrand fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, CarBrand> getMap(){
			return LOOKUP;
		}
		
	}
	
	public enum MotorBikeBrand {

		BJAJ("Bajaj"), BMW("BMW"), CHOPPER("Chopper"), DUKATI("Dukati"), FALCON("Falcon"), HARLYDAVIDSON("Harley Davidson"), HERO("Hero"), 
		HONDA("Honda"), KAWASAKI("Kawasaki"), KINETIC("Kinetic"), LONCIN("Loncin"), PIAGGIO("Piaggio"), SUZUKI("Suzuki"), TVS("TVS"), VESPA("Vespa"), 
		YAMAHA("Yamaha"), OTHER("Other");

		private String displayName;

		private MotorBikeBrand(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, MotorBikeBrand> LOOKUP = new LinkedHashMap<String, MotorBikeBrand>();
		private static final Map<String, MotorBikeBrand> CODE_LOOKUP = new LinkedHashMap<String, MotorBikeBrand>();

		static {
			for (MotorBikeBrand motorBikeBrand : EnumSet.allOf(MotorBikeBrand.class)) {
				LOOKUP.put(motorBikeBrand.getDisplayName(), motorBikeBrand);
				CODE_LOOKUP.put(motorBikeBrand.toString(), motorBikeBrand);
			}
		}
		
		public static MotorBikeBrand fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static MotorBikeBrand fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, MotorBikeBrand> getMap(){
			return LOOKUP;
		}
		
	}
	
	public enum VanBusBrand {

		ASHOKLEYLAND("Ashok Leyland"), CHANDA("Chanda"), CHANGAN("Changan"), DAIHATSU("Daihatsu"), EICHER("Eicher"), FORD("Ford"), FOTON("Foton"), 
		HINO("Hino"), HONDA("Honda"), HYUNDAI("Hyundai"), ISUZU("Isuzu"), MAHINDRA("Mahindra"), MAZDA("Mazda"), MERCEDESBENZ("Mercedes Benz"), MITSUBISHI("Mitsubishi"), 
		NISSAN("Nissan"), SUBARU("Subaru"), SUZUKI("Suzuki"), TATA("Tata"), TOYOTA("Toyota"), VOLVO("Volvo"), OTHER("Other");

		private String displayName;

		private VanBusBrand(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, VanBusBrand> LOOKUP = new LinkedHashMap<String, VanBusBrand>();
		private static final Map<String, VanBusBrand> CODE_LOOKUP = new LinkedHashMap<String, VanBusBrand>();

		static {
			for (VanBusBrand vanBusBrand : EnumSet.allOf(VanBusBrand.class)) {
				LOOKUP.put(vanBusBrand.getDisplayName(), vanBusBrand);
				CODE_LOOKUP.put(vanBusBrand.toString(), vanBusBrand);
			}
		}
		
		public static VanBusBrand fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static VanBusBrand fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, VanBusBrand> getMap(){
			return LOOKUP;
		}
		
	}
	
	public enum UploadImageType {
		
		PROFILE("PROFILE"), PRODUCT("PRODUCT");

		private String displayName;

		private UploadImageType(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, UploadImageType> LOOKUP = new LinkedHashMap<String, UploadImageType>();
		private static final Map<String, UploadImageType> CODE_LOOKUP = new LinkedHashMap<String, UploadImageType>();

		static {
			for (UploadImageType imageType : EnumSet.allOf(UploadImageType.class)) {
				LOOKUP.put(imageType.getDisplayName(), imageType);
				CODE_LOOKUP.put(imageType.toString(), imageType);
			}
		}
		
		public static UploadImageType fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static UploadImageType fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, UploadImageType> getMap(){
			return LOOKUP;
		}

	}
	
	public enum ProductStatus {
		
		PUBLISH("Publish"), UNPUBLISH("Unpublish");

		private String displayName;

		private ProductStatus(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, ProductStatus> LOOKUP = new LinkedHashMap<String, ProductStatus>();
		private static final Map<String, ProductStatus> CODE_LOOKUP = new LinkedHashMap<String, ProductStatus>();

		static {
			for (ProductStatus productStatus : EnumSet.allOf(ProductStatus.class)) {
				LOOKUP.put(productStatus.getDisplayName(), productStatus);
				CODE_LOOKUP.put(productStatus.toString(), productStatus);
			}
		}
		
		public static ProductStatus fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static ProductStatus fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, ProductStatus> getMap(){
			return LOOKUP;
		}

	}
	
	public enum AuthenticityType {
		
		ORIGINAL("Original"), DUBLICATEDCOPY("Duplicated Copy");

		private String displayName;

		private AuthenticityType(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, AuthenticityType> LOOKUP = new LinkedHashMap<String, AuthenticityType>();
		private static final Map<String, AuthenticityType> CODE_LOOKUP = new LinkedHashMap<String, AuthenticityType>();

		static {
			for (AuthenticityType authenticityType : EnumSet.allOf(AuthenticityType.class)) {
				LOOKUP.put(authenticityType.getDisplayName(), authenticityType);
				CODE_LOOKUP.put(authenticityType.toString(), authenticityType);
			}
		}
		
		public static AuthenticityType fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static AuthenticityType fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, AuthenticityType> getMap(){
			return LOOKUP;
		}

	}
	
	public enum ProductType {
		
		PERSONEL("Personel"), BUSINESS("Business");

		private String displayName;

		private ProductType(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, ProductType> LOOKUP = new LinkedHashMap<String, ProductType>();
		private static final Map<String, ProductType> CODE_LOOKUP = new LinkedHashMap<String, ProductType>();

		static {
			for (ProductType productType : EnumSet.allOf(ProductType.class)) {
				LOOKUP.put(productType.getDisplayName(), productType);
				CODE_LOOKUP.put(productType.toString(), productType);
			}
		}
		
		public static ProductType fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static ProductType fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, ProductType> getMap(){
			return LOOKUP;
		}

	}
	
	public enum ProductCondition {
		
		BRANDNEW("Brand New"), USED("Used"), BROKEN("Broken");

		private String displayName;

		private ProductCondition(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, ProductCondition> LOOKUP = new LinkedHashMap<String, ProductCondition>();
		private static final Map<String, ProductCondition> CODE_LOOKUP = new LinkedHashMap<String, ProductCondition>();

		static {
			for (ProductCondition productCondition : EnumSet.allOf(ProductCondition.class)) {
				LOOKUP.put(productCondition.getDisplayName(), productCondition);
				CODE_LOOKUP.put(productCondition.toString(), productCondition);
			}
		}
		
		public static ProductCondition fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static ProductCondition fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, ProductCondition> getMap(){
			return LOOKUP;
		}

	}
	
	public enum TransmissionType {
		
		MANUAL("Manual"), AUTO("Auto"), OTHER("Other");

		private String displayName;

		private TransmissionType(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, TransmissionType> LOOKUP = new LinkedHashMap<String, TransmissionType>();
		private static final Map<String, TransmissionType> CODE_LOOKUP = new LinkedHashMap<String, TransmissionType>();

		static {
			for (TransmissionType transmisstionType : EnumSet.allOf(TransmissionType.class)) {
				LOOKUP.put(transmisstionType.getDisplayName(), transmisstionType);
				CODE_LOOKUP.put(transmisstionType.toString(), transmisstionType);
			}
		}
		
		public static TransmissionType fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static TransmissionType fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, TransmissionType> getMap(){
			return LOOKUP;
		}

	}
	
	public enum BodyType {
		
		SALOON("Saloon"), HATCHBACK("Hatchback"), STATIONWAGON("Station Wagon"), CONVERTIBLE("Convertible"), COUPE("Coupe"), SUV("SUV"), MPV("MPV");

		private String displayName;

		private BodyType(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, BodyType> LOOKUP = new LinkedHashMap<String, BodyType>();
		private static final Map<String, BodyType> CODE_LOOKUP = new LinkedHashMap<String, BodyType>();

		static {
			for (BodyType bodyType : EnumSet.allOf(BodyType.class)) {
				LOOKUP.put(bodyType.getDisplayName(), bodyType);
				CODE_LOOKUP.put(bodyType.toString(), bodyType);
			}
		}
		
		public static BodyType fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static BodyType fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, BodyType> getMap(){
			return LOOKUP;
		}

	}
	
	public enum FuelType {
		
		DIESEL("Diesel"), PETROL("Petrol"), CNG("Cng"), OTHER("Other type");

		private String displayName;

		private FuelType(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, FuelType> LOOKUP = new LinkedHashMap<String, FuelType>();
		private static final Map<String, FuelType> CODE_LOOKUP = new LinkedHashMap<String, FuelType>();

		static {
			for (FuelType fuelType : EnumSet.allOf(FuelType.class)) {
				LOOKUP.put(fuelType.getDisplayName(), fuelType);
				CODE_LOOKUP.put(fuelType.toString(), fuelType);
			}
		}
		
		public static FuelType fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static FuelType fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, FuelType> getMap(){
			return LOOKUP;
		}

	}
	
	public enum ProductCategory {
		
		ELECTRONICS("Electronics"), VEHICLE("Vehicle"), PROPERTY("Property"), OTHER("Other");

		private String displayName;

		private ProductCategory(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, ProductCategory> LOOKUP = new LinkedHashMap<String, ProductCategory>();
		private static final Map<String, ProductCategory> CODE_LOOKUP = new LinkedHashMap<String, ProductCategory>();

		static {
			for (ProductCategory productCategory : EnumSet.allOf(ProductCategory.class)) {
				LOOKUP.put(productCategory.getDisplayName(), productCategory);
				CODE_LOOKUP.put(productCategory.toString(), productCategory);
			}
		}
		
		public static ProductCategory fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static ProductCategory fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, ProductCategory> getMap(){
			return LOOKUP;
		}

	}
	
	public enum ElectronicSubCategory {
		
		MOBILEPHONE("Mobile Phone"), MOBILEPHONEACCESSORIES("Mobile Phone Accessories"), COMPUTER("Computer"), COMPUTERACCESSORIES("Computer Accessories"),
		TV("TV"), CAMERA("Camera"), AUDIO("Audio"), OTHER("Other");

		private String displayName;

		private ElectronicSubCategory(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, ElectronicSubCategory> LOOKUP = new LinkedHashMap<String, ElectronicSubCategory>();
		private static final Map<String, ElectronicSubCategory> CODE_LOOKUP = new LinkedHashMap<String, ElectronicSubCategory>();

		static {
			for (ElectronicSubCategory electronicSubCategory : EnumSet.allOf(ElectronicSubCategory.class)) {
				LOOKUP.put(electronicSubCategory.getDisplayName(), electronicSubCategory);
				CODE_LOOKUP.put(electronicSubCategory.toString(), electronicSubCategory);
			}
		}
		
		public static ElectronicSubCategory fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static ElectronicSubCategory fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, ElectronicSubCategory> getMap(){
			return LOOKUP;
		}

	}
	
	public enum VehicleSubCategory {
		
		CAR("Car"), MOTORBIKE("Motor Bike"), THREEWHEELER("Three Wheeler"), VANBUS("Van and Buses"), WATERTRANSPORT("Water Transport"), AUTOPART("Auto part"), OTHER("Other");

		private String displayName;

		private VehicleSubCategory(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, VehicleSubCategory> LOOKUP = new LinkedHashMap<String, VehicleSubCategory>();
		private static final Map<String, VehicleSubCategory> CODE_LOOKUP = new LinkedHashMap<String, VehicleSubCategory>();

		static {
			for (VehicleSubCategory vehicleSubCategory : EnumSet.allOf(VehicleSubCategory.class)) {
				LOOKUP.put(vehicleSubCategory.getDisplayName(), vehicleSubCategory);
				CODE_LOOKUP.put(vehicleSubCategory.toString(), vehicleSubCategory);
			}
		}
		
		public static VehicleSubCategory fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static VehicleSubCategory fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, VehicleSubCategory> getMap(){
			return LOOKUP;
		}

	}
	
	public enum PropertySubCategory {
		
		LAND("Land"), HOUSE("House"), APARTMENT("Apartment"), OTHER("Other");

		private String displayName;

		private PropertySubCategory(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, PropertySubCategory> LOOKUP = new LinkedHashMap<String, PropertySubCategory>();
		private static final Map<String, PropertySubCategory> CODE_LOOKUP = new LinkedHashMap<String, PropertySubCategory>();

		static {
			for (PropertySubCategory propertySubCategory : EnumSet.allOf(PropertySubCategory.class)) {
				LOOKUP.put(propertySubCategory.getDisplayName(), propertySubCategory);
				CODE_LOOKUP.put(propertySubCategory.toString(), propertySubCategory);
			}
		}
		
		public static PropertySubCategory fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static PropertySubCategory fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, PropertySubCategory> getMap(){
			return LOOKUP;
		}

	}
	
	public enum MultimediaType {
		
		IMAGE("Image"), VIDEO("Video"), OTHER("Other");

		private String displayName;

		private MultimediaType(String name) {
			this.displayName = name;
		}

		public String getDisplayName() {
			return displayName;
		}

		private static final Map<String, MultimediaType> LOOKUP = new LinkedHashMap<String, MultimediaType>();
		private static final Map<String, MultimediaType> CODE_LOOKUP = new LinkedHashMap<String, MultimediaType>();

		static {
			for (MultimediaType multimediaType : EnumSet.allOf(MultimediaType.class)) {
				LOOKUP.put(multimediaType.getDisplayName(), multimediaType);
				CODE_LOOKUP.put(multimediaType.toString(), multimediaType);
			}
		}
		
		public static MultimediaType fromCode(String code) {
			return CODE_LOOKUP.get(code);
		}

		public static MultimediaType fromDisplayName(String displayName) {
			return LOOKUP.get(displayName);
		}
		
		public static Map<String, MultimediaType> getMap(){
			return LOOKUP;
		}

	}
}
