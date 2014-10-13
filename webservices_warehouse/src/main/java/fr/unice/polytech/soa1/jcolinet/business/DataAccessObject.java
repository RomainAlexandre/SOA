package fr.unice.polytech.soa1.jcolinet.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;

import fr.unice.polytech.soa1.jcolinet.business.Event.KindAction;

@Singleton(name = "Warehouse-DB-Mock")
public class DataAccessObject {
	private List<Employe> employes;
	private List<Box> boxes;
	private List<Event> events;
	private List<Warehouse> warehouses;

	public DataAccessObject() { 
		initBoxes();
		initEmployes();
		initEvent();
		intiWarehouse();
		link(); 
	}

	private void intiWarehouse() {
		warehouses = new ArrayList<Warehouse>();
		warehouses.add(new Warehouse("WH1", "P.O. Box 216, 6557 Integer St.", -21.06609, -163.63436, "0576JW", "Vaux-sur-Sure"));
		warehouses.add(new Warehouse("WH2", "P.O. Box 430, 7013 Commodo St.", 54.12438, 140.11072, "9239", "Norderstedt"));
		warehouses.add(new Warehouse("WH3", "8184 Erat Ave", 66.5834, 93.90718, "1624", "Sellano"));
		warehouses.add(new Warehouse("WH4", "Ap #545-5349 Aliquet Road", -53.58605, -112.00623, "98758", "Sargodha"));
		warehouses.add(new Warehouse("WH5", "352-4460 Nunc St.", -36.45038, 99.57527, "22714", "Valda"));
		warehouses.add(new Warehouse("WH6", "356-3090 Sociis St.", 14.54857, 99.33126, "47617", "Feldkirchen in Kärnten"));
		warehouses.add(new Warehouse("WH7", "Ap #569-158 Neque Rd.", -33.6888, -8.06549, "1089", "Henderson"));
		warehouses.add(new Warehouse("WH8", "Ap #188-948 Donec St.", 15.17362, -111.80038, "7442", "Bosa"));
		warehouses.add(new Warehouse("WH9", "719-9027 Dui Avenue", 39.3695, -102.66681, "843798", "Lossiemouth"));
		warehouses.add(new Warehouse("WH10", "4613 Ligula Rd.", -17.00142, 129.28241, "141693", "Armstrong"));
		warehouses.add(new Warehouse("WH11", "598-2533 Lorem Road", 54.97228, -165.16272, "652548", "Bayreuth"));
		warehouses.add(new Warehouse("WH12", "6752 Interdum. Rd.", -24.69047, 4.95682, "A1V 5V4", "Zelem"));
		warehouses.add(new Warehouse("WH13", "P.O. Box 606, 394 Sapien. St.", -89.29621, -126.7805, "48842", "Gambolò"));
		warehouses.add(new Warehouse("WH14", "P.O. Box 664, 8927 Ornare St.", 18.65788, -85.53116, "75336-112", "Courbevoie"));
		warehouses.add(new Warehouse("WH15", "670-9456 Duis St.", -11.06918, 171.79833, "6687", "Bhiwandi"));
		warehouses.add(new Warehouse("WH16", "735-158 Nec, Rd.", -17.76726, -133.59838, "5809", "Goes"));
		warehouses.add(new Warehouse("WH17", "584 Morbi Rd.", 54.77107, 111.7533, "49226", "Vergemoli"));
		warehouses.add(new Warehouse("WH18", "1978 Turpis. St.", -37.45044, 80.79906, "65650", "Erode"));
		warehouses.add(new Warehouse("WH19", "787-4846 Tellus. Street", 79.57346, 45.07077, "10802", "Waalwijk"));
		warehouses.add(new Warehouse("WH20", "P.O. Box 124, 1719 Nisl. St.", -21.50081, 166.97041, "62100", "Sassocorvaro"));
		warehouses.add(new Warehouse("WH21", "Ap #282-3041 Nunc Avenue", 46.69854, 147.37981, "HZ3O 3WF", "Lissewege"));
		warehouses.add(new Warehouse("WH22", "P.O. Box 346, 5202 Imperdiet Rd.", 76.21202, -75.26807, "4836WK", "Sousa"));
		warehouses.add(new Warehouse("WH23", "243-5372 Suspendisse St.", 12.89789, 104.5016, "125911", "Albury"));
		warehouses.add(new Warehouse("WH24", "P.O. Box 552, 4997 Est St.", 51.13979, 24.2514, "63475-577", "Neufeld an der Leitha"));
		warehouses.add(new Warehouse("WH25", "6209 Proin Rd.", 36.45954, 85.82717, "54250-238", "Oklahoma City"));
		warehouses.add(new Warehouse("WH26", "P.O. Box 805, 5245 Interdum Rd.", 6.28971, 23.61294, "5606", "Nothomb"));
		warehouses.add(new Warehouse("WH27", "P.O. Box 722, 7713 Nullam Road", -82.51505, 2.61672, "38166", "Ingelheim"));
		warehouses.add(new Warehouse("WH28", "Ap #971-4596 Ante. Rd.", 21.53755, -64.95307, "V9R 9E6", "Perth"));
		warehouses.add(new Warehouse("WH29", "Ap #356-7528 Lorem Road", 52.51649, -54.59511, "3229", "Cape Breton Island"));
		warehouses.add(new Warehouse("WH30", "3128 Fusce Rd.", -5.13488, 177.36513, "5761", "Mornimont"));
		warehouses.add(new Warehouse("WH31", "P.O. Box 750, 1693 Magnis Street", 58.51663, 102.25906, "Y8J 3H0", "Spormaggiore"));
		warehouses.add(new Warehouse("WH32", "902-8046 Mi. Rd.", -84.16856, 135.94448, "6311HL", "Dover"));
		warehouses.add(new Warehouse("WH33", "Ap #114-4633 Non, Rd.", -35.87854, -101.69245, "88942", "Westmalle"));
		warehouses.add(new Warehouse("WH34", "P.O. Box 739, 8905 Facilisis Av.", -40.42685, -31.87774, "88504", "Pastena"));
		warehouses.add(new Warehouse("WH35", "2083 Fringilla St.", -6.13456, 81.54766, "3686", "Amsterdam"));
		warehouses.add(new Warehouse("WH36", "Ap #808-8768 Adipiscing Street", -47.7924, 118.46859, "L5K 5B0", "Baltimore"));
		warehouses.add(new Warehouse("WH37", "Ap #973-9314 Magna. Rd.", -2.9952, 150.44921, "822597", "Fahler"));
		warehouses.add(new Warehouse("WH38", "733-1385 Felis Rd.", 56.11584, -74.00545, "88491", "Nandyal"));
		warehouses.add(new Warehouse("WH39", "5995 Quisque Av.", -74.13198, -112.44886, "22158", "Rhemes-Saint-Georges"));
		warehouses.add(new Warehouse("WH40", "753-4219 Euismod Rd.", 47.32707, -7.82588, "534499", "Cerreto di Spoleto"));
		warehouses.add(new Warehouse("WH41", "4260 Sed, Ave", 61.68122, -177.24931, "00606-086", "Frederick"));
		warehouses.add(new Warehouse("WH42", "Ap #385-5762 Quis St.", -46.2821, -26.67566, "11470", "Messancy"));
		warehouses.add(new Warehouse("WH43", "Ap #493-4257 Massa. Ave", -69.8003, -52.43511, "1340", "Varanasi"));
		warehouses.add(new Warehouse("WH44", "P.O. Box 275, 1955 Facilisis, Rd.", -53.18232, -152.90708, "562574", "Juneau"));
		warehouses.add(new Warehouse("WH45", "Ap #129-6003 Erat Ave", -68.5393, 14.22824, "25432", "Dorval"));
		warehouses.add(new Warehouse("WH46", "P.O. Box 966, 7049 Tempor, Road", -64.99619, -29.46409, "2598", "Ottawa"));
		warehouses.add(new Warehouse("WH47", "Ap #673-3020 Velit Street", 19.4678, 99.03485, "964151", "Gie�en"));
		warehouses.add(new Warehouse("WH48", "610-1532 Nunc Avenue", -15.35583, -9.61584, "01439", "Beaumont"));
		warehouses.add(new Warehouse("WH49", "Ap #632-1251 Duis St.", 27.16537, 175.64363, "77-671", "Sainte-Marie-sur-Semois"));
		warehouses.add(new Warehouse("WH50", "Ap #654-4904 Dapibus Road", -50.31814, 167.31237, "6104TX", "Attimis"));
		warehouses.add(new Warehouse("WH51", "4744 Duis St.", -43.65035, 25.21233, "70220", "Laon"));
		warehouses.add(new Warehouse("WH52", "P.O. Box 990, 8080 Euismod Street", -85.67837, 92.16699, "4774", "Neustrelitz"));
		warehouses.add(new Warehouse("WH53", "8729 Et Rd.", 6.86012, 79.63093, "0407", "Moricone"));
		warehouses.add(new Warehouse("WH54", "749-6328 Lorem. Avenue", -1.34743, -7.27852, "6389VY", "Rockville"));
		warehouses.add(new Warehouse("WH55", "339-9170 Porttitor Ave", -76.40593, -104.31996, "5752", "Grand-Rosi�re-Hottomont"));
		warehouses.add(new Warehouse("WH56", "1002 Nullam Rd.", -66.60203, 2.70619, "758391", "Sambuca Pistoiese"));
		warehouses.add(new Warehouse("WH57", "4781 Lacus. St.", -1.839, 124.66392, "56902-240", "Helensburgh"));
		warehouses.add(new Warehouse("WH58", "Ap #651-5717 Mauris Av.", -80.88263, -100.31987, "L9 1UZ", "Affligem"));
		warehouses.add(new Warehouse("WH59", "558-2400 Lobortis Avenue", -51.41318, 98.7217, "374857", "Grande Prairie"));
		warehouses.add(new Warehouse("WH60", "Ap #639-2435 In St.", -47.46054, 137.76877, "R6R 5T7", "Tewkesbury"));
		warehouses.add(new Warehouse("WH61", "777-974 A Ave", 29.58607, 30.32445, "59393", "San Clemente"));
		warehouses.add(new Warehouse("WH62", "6627 Auctor Rd.", 56.7329, 107.68239, "44-962", "Neum�nster"));
		warehouses.add(new Warehouse("WH63", "533-4724 Rutrum Av.", -6.25385, 148.11614, "765668", "Glovertown"));
		warehouses.add(new Warehouse("WH64", "1034 Nec, Rd.", -35.86568, -94.49095, "41113", "Patan"));
		warehouses.add(new Warehouse("WH65", "7517 Blandit Rd.", -70.98893, -139.55444, "P0G 8W6", "Boise"));
		warehouses.add(new Warehouse("WH66", "P.O. Box 657, 8449 Sem. Road", -29.0795, 69.86226, "4005", "Melton Mowbray"));
		warehouses.add(new Warehouse("WH67", "Ap #155-5619 Iaculis Avenue", -14.14496, 173.46876, "1504", "Konin"));
		warehouses.add(new Warehouse("WH68", "2179 Congue Ave", 74.09064, -87.58295, "873816", "Couthuin"));
		warehouses.add(new Warehouse("WH69", "P.O. Box 923, 355 Sapien. St.", 40.09383, 142.85837, "N1A 0Z4", "Mobile"));
		warehouses.add(new Warehouse("WH70", "354-7085 Lacus. Av.", -48.28014, 120.00687, "12048", "Witney"));
		warehouses.add(new Warehouse("WH71", "Ap #272-5295 Ut, Ave", 45.73391, 110.88471, "60326-316", "Bijapur"));
		warehouses.add(new Warehouse("WH72", "P.O. Box 324, 8862 Massa. St.", 11.27573, -93.37415, "56028", "Bastogne"));
		warehouses.add(new Warehouse("WH73", "583-5846 Luctus Road", -54.49392, 17.68013, "93409", "Hatfield"));
		warehouses.add(new Warehouse("WH74", "P.O. Box 971, 7973 Consectetuer Avenue", -38.80882, -5.09123, "1288", "Burlington"));
		warehouses.add(new Warehouse("WH75", "Ap #239-1774 Sit Road", 84.1165, -139.88376, "3251", "Asso"));
		warehouses.add(new Warehouse("WH76", "2394 Purus Rd.", -88.26196, 28.67523, "25073", "Waardamme"));
		warehouses.add(new Warehouse("WH77", "6406 Quis, Av.", 15.00898, 43.54952, "25747", "Sainte-Marie-sur-Semois"));
		warehouses.add(new Warehouse("WH78", "8064 Eu Road", 76.67207, 12.38644, "70111", "Bayswater"));
		warehouses.add(new Warehouse("WH79", "P.O. Box 861, 2141 Rutrum, Av.", -13.12524, -121.01757, "5536", "Ashburton"));
		warehouses.add(new Warehouse("WH80", "309-4882 Metus. Rd.", -83.05533, -151.97325, "6168", "G�rouville"));
		warehouses.add(new Warehouse("WH81", "799-1019 Feugiat. Rd.", -26.06016, 9.81375, "39798", "Gonnosfanadiga"));
		warehouses.add(new Warehouse("WH82", "P.O. Box 433, 7541 A, Street", 42.19744, 26.02556, "36040", "Bras"));
		warehouses.add(new Warehouse("WH83", "Ap #369-6415 Tempor Rd.", -59.6315, 59.03349, "R9C 6G3", "Shillong"));
		warehouses.add(new Warehouse("WH84", "6715 Molestie Rd.", -69.05627, -83.07202, "401909", "Rochester"));
		warehouses.add(new Warehouse("WH85", "Ap #471-6634 Turpis Ave", -47.72852, -75.00493, "9803", "Portici"));
		warehouses.add(new Warehouse("WH86", "1681 Lorem, Street", -75.57947, -150.26634, "B2T 8EX", "Minervino di Lecce"));
		warehouses.add(new Warehouse("WH87", "Ap #202-414 Magnis Ave", -18.7761, -56.61797, "570578", "Kansas City"));
		warehouses.add(new Warehouse("WH88", "318-1771 Sagittis. St.", 53.52336, 61.21775, "2911", "San Rafael Abajo"));
		warehouses.add(new Warehouse("WH89", "6360 Et Ave", -36.58173, -87.86505, "X5P 4E7", "Buzenol"));
		warehouses.add(new Warehouse("WH90", "8570 Ullamcorper, Avenue", 23.2458, -118.02645, "11213", "Frankston"));
		warehouses.add(new Warehouse("WH91", "Ap #267-5278 Nulla. St.", -45.65177, 145.23555, "20189", "Wernigerode"));
		warehouses.add(new Warehouse("WH92", "Ap #458-4170 Montes, Street", -68.88522, -2.21711, "87030", "Zwevegem"));
		warehouses.add(new Warehouse("WH93", "Ap #733-4698 Dui, Road", 28.25966, -137.30093, "4386", "Lafayette"));
		warehouses.add(new Warehouse("WH94", "2779 Tellus Rd.", 81.22168, 47.39223, "15189", "Tsiigehtchic"));
		warehouses.add(new Warehouse("WH95", "644-6260 Vitae, St.", 42.06701, -163.60602, "9510OH", "Tulita"));
		warehouses.add(new Warehouse("WH96", "Ap #379-4068 Mauris Rd.", 26.74649, -15.06386, "35034", "Acciano"));
		warehouses.add(new Warehouse("WH97", "P.O. Box 255, 9420 Sollicitudin Road", 77.61178, -48.36461, "9722", "Tampa"));
		warehouses.add(new Warehouse("WH98", "P.O. Box 134, 7371 Magnis St.", -16.84671, -52.30247, "1654", "Bossuit"));
		warehouses.add(new Warehouse("WH99", "5169 Mus. Avenue", 74.11813, -46.91089, "130507", "Columbia"));
		warehouses.add(new Warehouse("WH100", "Ap #765-7781 Lacus. Ave", 89.75078, -115.66372, "11118", "Kanchipuram"));

	}

	private void initEvent() {
		events = new ArrayList<Event>();
		events.add(new Event("_1316387260", KindAction.getKindAction("delivery"), 15, 15, 34, new Product("Q2P4ZW8FJ21NG1Q", 22, 82, 47)));
		events.add(new Event("_4695671566", KindAction.getKindAction("delivery"), 15, 00, 30, new Product("H8C7JA1OE73NU4P", 9, 11, 32)));
		events.add(new Event("_6828765938", KindAction.getKindAction("pickup"), 8, 30, 38, new Product("N4E4MT9ZV46FD3S", 42, 72, 87)));
		events.add(new Event("_9736601553", KindAction.getKindAction("pickup"), 11, 30, 48, new Product("D4K4UB7FJ34DB9Z", 68, 21, 5)));
		events.add(new Event("_9008727099", KindAction.getKindAction("pickup"), 16, 45, 38, new Product("J9G5FR8UC16WU2Q", 13, 88, 90)));
		events.add(new Event("_6389693407", KindAction.getKindAction("pickup"), 14, 00, 16, new Product("T3O7II9UP74GT5X", 69, 9, 98)));
		events.add(new Event("_8021571331", KindAction.getKindAction("pickup"), 12, 30, 8, new Product("O2U1CQ5WQ96EI4I", 23, 46, 50)));
		events.add(new Event("_6424730133", KindAction.getKindAction("delivery"), 14, 30, 33, new Product("H7S2VS2VS36JW7H", 83, 71, 91)));
		events.add(new Event("_4237732723", KindAction.getKindAction("pickup"), 15, 15, 19, new Product("G1N2ZL2JG82HA7U", 30, 8, 72)));
		events.add(new Event("_4339427917", KindAction.getKindAction("pickup"), 12, 30, 11, new Product("K2O6UM1EV77EL8J", 72, 16, 37)));
		events.add(new Event("_9744950056", KindAction.getKindAction("pickup"), 15, 45, 28, new Product("M2Y5HL7TK13XN6M", 49, 60, 56)));
		events.add(new Event("_7032344449", KindAction.getKindAction("pickup"), 13, 15, 49, new Product("I6W3VZ7WD41RE8V", 89, 37, 1)));
		events.add(new Event("_3154412402", KindAction.getKindAction("pickup"), 14, 15, 27, new Product("C4L8OI2NB39ZG5A", 86, 77, 9)));
		events.add(new Event("_7650781211", KindAction.getKindAction("delivery"), 16, 30, 27, new Product("C5Y1ZJ1GU24QQ2O", 87, 76, 90)));
		events.add(new Event("_3824419973", KindAction.getKindAction("delivery"), 16, 30, 4, new Product("P1B9EQ8GT86KP3U", 41, 7, 59)));
		events.add(new Event("_8000509310", KindAction.getKindAction("pickup"), 9, 00, 26, new Product("V4O1LC9HR21ZZ3E", 80, 33, 55)));
		events.add(new Event("_9551415594", KindAction.getKindAction("delivery"), 8, 15, 8, new Product("V7U3AJ5TH51RH2W", 59, 65, 90)));
		events.add(new Event("_8020408651", KindAction.getKindAction("pickup"), 15, 15, 40, new Product("S5Y5LP5WZ97OP5W", 46, 27, 57)));
		events.add(new Event("_2927344192", KindAction.getKindAction("pickup"), 17, 15, 42, new Product("S2J6NO9ZR53BF4M", 19, 60, 71)));
		events.add(new Event("_4485033317", KindAction.getKindAction("delivery"), 13, 30, 12, new Product("X5G3VX4ZX13WR6S", 17, 73, 90)));
		events.add(new Event("_1402625871", KindAction.getKindAction("delivery"), 14, 45, 24, new Product("A2A2BP7ZA13TB9F", 85, 71, 88)));
		events.add(new Event("_9549445604", KindAction.getKindAction("pickup"), 13, 00, 38, new Product("N1U4RC6CX25PE9A", 15, 27, 19)));
		events.add(new Event("_1291479563", KindAction.getKindAction("pickup"), 17, 30, 6, new Product("Q9G2PV1NW49MJ1J", 83, 28, 96)));
		events.add(new Event("_7544906543", KindAction.getKindAction("delivery"), 10, 30, 22, new Product("F9J8BH8NH13PZ7U", 40, 54, 45)));
		events.add(new Event("_3557584291", KindAction.getKindAction("pickup"), 8, 45, 28, new Product("P4V9BE9BJ36AW7T", 94, 29, 13)));
		events.add(new Event("_9119272695", KindAction.getKindAction("pickup"), 11, 45, 8, new Product("U7E9AT2MW96GZ5W", 29, 71, 65)));
		events.add(new Event("_8457127530", KindAction.getKindAction("delivery"), 15, 00, 6, new Product("C3Z3PF5ZF53WF6S", 53, 13, 28)));
		events.add(new Event("_9802462568", KindAction.getKindAction("pickup"), 16, 00, 22, new Product("Q3D4UQ7MT66CB9G", 86, 31, 71)));
		events.add(new Event("_1748542925", KindAction.getKindAction("pickup"), 9, 15, 38, new Product("G2K4ZY6KF73BF1Q", 38, 37, 51)));
		events.add(new Event("_4447671702", KindAction.getKindAction("pickup"), 13, 15, 16, new Product("Z7W9NS1FI15BK4A", 57, 8, 63)));
		events.add(new Event("_6509464279", KindAction.getKindAction("delivery"), 13, 45, 17, new Product("Q7Y8MJ5VB75ZZ9Q", 83, 81, 56)));
		events.add(new Event("_4410183276", KindAction.getKindAction("pickup"), 12, 30, 36, new Product("S6B5LB8AY16UE3W", 48, 44, 13)));
		events.add(new Event("_4146754249", KindAction.getKindAction("delivery"), 13, 15, 14, new Product("E3O2MD2LS71HN5S", 8, 23, 92)));
		events.add(new Event("_3675907524", KindAction.getKindAction("delivery"), 14, 30, 49, new Product("F9Y7SV5QF38RL4J", 46, 70, 75)));
		events.add(new Event("_6561110035", KindAction.getKindAction("pickup"), 15, 45, 6, new Product("A8U6LS4ZL47DC1X", 34, 24, 41)));
		events.add(new Event("_7603139035", KindAction.getKindAction("pickup"), 10, 30, 47, new Product("J2C4EH2ES54SR8M", 21, 84, 85)));
		events.add(new Event("_1765277701", KindAction.getKindAction("delivery"), 9, 15, 8, new Product("V7F8XN3OG88LH4T", 75, 28, 26)));
		events.add(new Event("_5771996582", KindAction.getKindAction("delivery"), 16, 30, 48, new Product("N5Y7KB7VJ42WR2A", 12, 34, 95)));
		events.add(new Event("_4681990243", KindAction.getKindAction("delivery"), 16, 30, 38, new Product("J2P1FP8ZQ38UT1S", 41, 66, 5)));
		events.add(new Event("_3393529253", KindAction.getKindAction("delivery"), 13, 30, 37, new Product("N3Y2AH5SJ82FC3O", 57, 56, 70)));
		events.add(new Event("_9197368945", KindAction.getKindAction("delivery"), 9, 00, 44, new Product("C2I4XS3LN28XI8H", 64, 78, 20)));
		events.add(new Event("_4093588456", KindAction.getKindAction("delivery"), 15, 45, 14, new Product("E8J3ME9RR88QO5E", 67, 33, 36)));
		events.add(new Event("_2347369151", KindAction.getKindAction("delivery"), 9, 15, 2, new Product("Q5V4NT9UG16PG6M", 44, 93, 7)));
		events.add(new Event("_8521807173", KindAction.getKindAction("delivery"), 11, 00, 36, new Product("J8C5AB6HE68KK4F", 17, 37, 67)));
		events.add(new Event("_9906494895", KindAction.getKindAction("delivery"), 17, 00, 40, new Product("X2B6LP6CV67LP8N", 68, 7, 94)));
		events.add(new Event("_3160066278", KindAction.getKindAction("delivery"), 11, 15, 4, new Product("I2U4BG2LU47SL3G", 5, 35, 57)));
		events.add(new Event("_8279141750", KindAction.getKindAction("pickup"), 10, 30, 39, new Product("A7X5MK6LR75PD5H", 76, 77, 34)));
		events.add(new Event("_7839421345", KindAction.getKindAction("pickup"), 16, 00, 32, new Product("D4A9RT6PR42WI4J", 87, 27, 19)));
		events.add(new Event("_2683753033", KindAction.getKindAction("pickup"), 14, 30, 36, new Product("O7F4KQ5AC88XL9T", 13, 25, 81)));
		events.add(new Event("_2926044655", KindAction.getKindAction("pickup"), 8, 15, 50, new Product("F1T8FN2PP49IL9V", 77, 58, 17)));
		events.add(new Event("_4265056019", KindAction.getKindAction("delivery"), 14, 15, 3, new Product("T4S1PD3NE82GT2O", 2, 25, 97)));
		events.add(new Event("_3144477441", KindAction.getKindAction("pickup"), 9, 30, 25, new Product("M5P5HL3OV75KJ2T", 16, 28, 26)));
		events.add(new Event("_1891026024", KindAction.getKindAction("delivery"), 14, 45, 40, new Product("O6Z5OE4OF71OF2E", 1, 29, 4)));
		events.add(new Event("_7470373042", KindAction.getKindAction("pickup"), 10, 45, 22, new Product("Q9R1CF9JX45GP7M", 15, 47, 76)));
		events.add(new Event("_5521204436", KindAction.getKindAction("delivery"), 11, 00, 12, new Product("Q1Z6TA5IT57JC4E", 12, 23, 72)));
		events.add(new Event("_1167190405", KindAction.getKindAction("pickup"), 13, 00, 24, new Product("G5W7JO9VY19NS7D", 36, 59, 35)));
		events.add(new Event("_2385155434", KindAction.getKindAction("pickup"), 10, 15, 2, new Product("A9R1OF2YN52KB7W", 29, 11, 95)));
		events.add(new Event("_4870164994", KindAction.getKindAction("pickup"), 11, 30, 12, new Product("P7U2AO8HR16NP7D", 17, 3, 69)));
		events.add(new Event("_6625724062", KindAction.getKindAction("pickup"), 14, 00, 18, new Product("X9K9VT4YH18KS5K", 54, 34, 72)));
		events.add(new Event("_4616764552", KindAction.getKindAction("delivery"), 13, 30, 26, new Product("H7Q3BN9UX27ZH3H", 55, 62, 99)));
		events.add(new Event("_6954448054", KindAction.getKindAction("delivery"), 12, 00, 10, new Product("C8S1BR7XQ87EG5K", 29, 91, 90)));
		events.add(new Event("_7425591094", KindAction.getKindAction("delivery"), 8, 15, 28, new Product("L9V9NJ2PB86PB1G", 29, 83, 18)));
		events.add(new Event("_6938635529", KindAction.getKindAction("delivery"), 12, 15, 19, new Product("M5U3PE7UJ39NW2A", 38, 83, 27)));
		events.add(new Event("_6467539512", KindAction.getKindAction("delivery"), 15, 15, 33, new Product("C4Z6MF7SF27NN9M", 34, 86, 54)));
		events.add(new Event("_5427085971", KindAction.getKindAction("pickup"), 13, 30, 46, new Product("Z5N4WA4TW85CC9M", 36, 2, 58)));
		events.add(new Event("_3602748104", KindAction.getKindAction("pickup"), 10, 45, 50, new Product("K9I3RQ6JU73NU1N", 54, 30, 35)));
		events.add(new Event("_4169286767", KindAction.getKindAction("delivery"), 8, 00, 41, new Product("J9M2YU6TW83HF5G", 36, 99, 61)));
		events.add(new Event("_3328876367", KindAction.getKindAction("delivery"), 17, 15, 6, new Product("O8P6ZI5LP29ID4F", 29, 25, 26)));
		events.add(new Event("_8091126566", KindAction.getKindAction("pickup"), 8, 15, 49, new Product("G9Z3NO7BZ22IC9K", 33, 32, 18)));
		events.add(new Event("_1903881950", KindAction.getKindAction("pickup"), 12, 00, 28, new Product("U3W4TK3EJ27XA3E", 73, 15, 34)));
		events.add(new Event("_1447262433", KindAction.getKindAction("delivery"), 14, 00, 28, new Product("V8O8SW9UQ62DI9I", 78, 8, 26)));
		events.add(new Event("_2642121930", KindAction.getKindAction("pickup"), 10, 00, 32, new Product("U3V1TS8BS14WT8G", 35, 25, 10)));
		events.add(new Event("_9535870620", KindAction.getKindAction("pickup"), 10, 45, 1, new Product("V1Y7NU5OY45JQ5Q", 58, 49, 2)));
		events.add(new Event("_7116885004", KindAction.getKindAction("pickup"), 10, 30, 26, new Product("M3W8UC9UR94GW3P", 66, 91, 92)));
		events.add(new Event("_1638451841", KindAction.getKindAction("pickup"), 10, 30, 31, new Product("C5F3EE3VT56KU8B", 76, 49, 94)));
		events.add(new Event("_8174247957", KindAction.getKindAction("delivery"), 13, 00, 7, new Product("T3G7ZU1SM98SB7R", 44, 35, 87)));
		events.add(new Event("_9314156712", KindAction.getKindAction("delivery"), 11, 45, 19, new Product("X2Y6QE1WV11LW8J", 48, 44, 42)));
		events.add(new Event("_5346984038", KindAction.getKindAction("delivery"), 12, 15, 2, new Product("U8E1RT3PK71AF2H", 94, 98, 76)));
		events.add(new Event("_7051916876", KindAction.getKindAction("pickup"), 16, 45, 36, new Product("L5T2OH4OJ17JY9S", 51, 53, 98)));
		events.add(new Event("_3612479327", KindAction.getKindAction("pickup"), 10, 45, 34, new Product("R3C4XC7VN65EQ6V", 53, 15, 29)));
		events.add(new Event("_4455328214", KindAction.getKindAction("delivery"), 8, 15, 23, new Product("M7I2GU2VY28EP9X", 19, 3, 75)));
		events.add(new Event("_7205460269", KindAction.getKindAction("delivery"), 9, 15, 28, new Product("T4D7SZ8SN74PJ4D", 79, 96, 57)));
		events.add(new Event("_8592792449", KindAction.getKindAction("pickup"), 15, 30, 6, new Product("N9R2KX5AN65LT3W", 9, 82, 33)));
		events.add(new Event("_4200060683", KindAction.getKindAction("pickup"), 15, 00, 10, new Product("A9Y6IA9IP63JO7A", 58, 11, 63)));
		events.add(new Event("_5282337945", KindAction.getKindAction("delivery"), 11, 00, 24, new Product("S7F1VR3KV23AJ7L", 80, 95, 44)));
		events.add(new Event("_2783116531", KindAction.getKindAction("delivery"), 17, 15, 1, new Product("K9H9GR6TR22WB8U", 28, 71, 80)));
		events.add(new Event("_1782525612", KindAction.getKindAction("pickup"), 17, 00, 29, new Product("E2Q6OY5GR48BY8D", 78, 72, 21)));
		events.add(new Event("_2925032978", KindAction.getKindAction("delivery"), 17, 30, 18, new Product("A1W7OR1UX29HF6V", 60, 26, 66)));
		events.add(new Event("_4997043003", KindAction.getKindAction("pickup"), 14, 15, 4, new Product("E5Q5ZH5HJ52WA9L", 56, 62, 31)));
		events.add(new Event("_3815756276", KindAction.getKindAction("pickup"), 10, 15, 30, new Product("M2U7TY1BN33IN3Z", 82, 28, 96)));
		events.add(new Event("_4161801186", KindAction.getKindAction("delivery"), 16, 45, 35, new Product("L7J6WB6SY37YN7T", 41, 73, 29)));
		events.add(new Event("_8133899569", KindAction.getKindAction("pickup"), 9, 15, 49, new Product("E2Q7CL4IP78EH6P", 36, 20, 13)));
		events.add(new Event("_4858564792", KindAction.getKindAction("pickup"), 12, 45, 1, new Product("H8O4EE6VW41RI9K", 15, 95, 85)));
		events.add(new Event("_3980529344", KindAction.getKindAction("delivery"), 9, 00, 11, new Product("K9Z5BX7AP27FJ2P", 15, 49, 30)));
		events.add(new Event("_2188091297", KindAction.getKindAction("delivery"), 9, 30, 44, new Product("I4P1IZ1FJ99HY4N", 70, 82, 91)));
		events.add(new Event("_2938292000", KindAction.getKindAction("delivery"), 11, 15, 16, new Product("H9Y2NH1HB79LJ5O", 89, 78, 40)));
		events.add(new Event("_4162829502", KindAction.getKindAction("pickup"), 13, 30, 12, new Product("Y3E6FH9BJ27AU7P", 87, 2, 49)));
		events.add(new Event("_4098875580", KindAction.getKindAction("pickup"), 10, 45, 27, new Product("Z2Q7HN2XQ39LC1R", 58, 7, 69)));
		events.add(new Event("_2825740066", KindAction.getKindAction("pickup"), 11, 30, 29, new Product("F9T7FN4TG33WC5F", 89, 28, 12)));
		events.add(new Event("_9535291466", KindAction.getKindAction("delivery"), 13, 30, 20, new Product("O5T2PR6JM18QK2T", 68, 41, 35)));
		
	}

	private void initEmployes() {
		employes = new ArrayList<Employe>();
		employes.add(new Employe("EP1", "Bond", "Lesley"));
		employes.add(new Employe("EP2", "Abbott", "Cameron"));
		employes.add(new Employe("EP3", "Mcintosh", "Daquan"));
		employes.add(new Employe("EP4", "Castillo", "Barclay"));
		employes.add(new Employe("EP5", "Compton", "Sopoline"));
		employes.add(new Employe("EP6", "Gardner", "Lacy"));
		employes.add(new Employe("EP7", "Colon", "Bree"));
		employes.add(new Employe("EP8", "Wells", "Belle"));
		employes.add(new Employe("EP9", "Cruz", "Cullen"));
		employes.add(new Employe("EP10", "Neal", "Len"));
		employes.add(new Employe("EP11", "Craft", "Patricia"));
		employes.add(new Employe("EP12", "Crawford", "Susan"));
		employes.add(new Employe("EP13", "Douglas", "Igor"));
		employes.add(new Employe("EP14", "Jones", "Carter"));
		employes.add(new Employe("EP15", "Wolfe", "Patience"));
		employes.add(new Employe("EP16", "Richards", "Hilda"));
		employes.add(new Employe("EP17", "Holden", "Danielle"));
		employes.add(new Employe("EP18", "Saunders", "Kaye"));
		employes.add(new Employe("EP19", "Joyce", "Tasha"));
		employes.add(new Employe("EP20", "Sosa", "Kibo"));
		employes.add(new Employe("EP21", "Howard", "Urielle"));
		employes.add(new Employe("EP22", "Gallagher", "Doris"));
		employes.add(new Employe("EP23", "Brooks", "Samantha"));
		employes.add(new Employe("EP24", "Hurley", "Guinevere"));
		employes.add(new Employe("EP25", "Moore", "Karyn"));
		employes.add(new Employe("EP26", "Aguilar", "Justin"));
		employes.add(new Employe("EP27", "Dennis", "Zelda"));
		employes.add(new Employe("EP28", "Jimenez", "Veda"));
		employes.add(new Employe("EP29", "Duke", "Fletcher"));
		employes.add(new Employe("EP30", "Walker", "Lawrence"));
		employes.add(new Employe("EP31", "Mullins", "Jared"));
		employes.add(new Employe("EP32", "Tillman", "Callie"));
		employes.add(new Employe("EP33", "Guzman", "Lacota"));
		employes.add(new Employe("EP34", "Miranda", "Neville"));
		employes.add(new Employe("EP35", "Marshall", "Fletcher"));
		employes.add(new Employe("EP36", "Fleming", "Lois"));
		employes.add(new Employe("EP37", "Greer", "Vaughan"));
		employes.add(new Employe("EP38", "Beasley", "August"));
		employes.add(new Employe("EP39", "Pittman", "Cally"));
		employes.add(new Employe("EP40", "Tyler", "Jarrod"));
		employes.add(new Employe("EP41", "Holder", "Leslie"));
		employes.add(new Employe("EP42", "Andrews", "Laura"));
		employes.add(new Employe("EP43", "Conley", "Tobias"));
		employes.add(new Employe("EP44", "Luna", "Benedict"));
		employes.add(new Employe("EP45", "Fitzpatrick", "Buckminster"));
		employes.add(new Employe("EP46", "Nichols", "Ivy"));
		employes.add(new Employe("EP47", "Duke", "Victoria"));
		employes.add(new Employe("EP48", "Osborn", "Sonia"));
		employes.add(new Employe("EP49", "Stanley", "Lacy"));
		employes.add(new Employe("EP50", "Hebert", "Oliver"));
		employes.add(new Employe("EP51", "Jefferson", "Daniel"));
		employes.add(new Employe("EP52", "Wall", "Holly"));
		employes.add(new Employe("EP53", "Hanson", "Joshua"));
		employes.add(new Employe("EP54", "Pope", "Chadwick"));
		employes.add(new Employe("EP55", "Gaines", "Winter"));
		employes.add(new Employe("EP56", "Bernard", "Michelle"));
		employes.add(new Employe("EP57", "Cleveland", "Kristen"));
		employes.add(new Employe("EP58", "Schultz", "Alexis"));
		employes.add(new Employe("EP59", "Wooten", "Charlotte"));
		employes.add(new Employe("EP60", "Graham", "Zahir"));
		employes.add(new Employe("EP61", "Blackburn", "Hayes"));
		employes.add(new Employe("EP62", "Macdonald", "Quon"));
		employes.add(new Employe("EP63", "Sandoval", "Gretchen"));
		employes.add(new Employe("EP64", "May", "Erin"));
		employes.add(new Employe("EP65", "Riggs", "Blossom"));
		employes.add(new Employe("EP66", "Pitts", "Basil"));
		employes.add(new Employe("EP67", "Lee", "Jamal"));
		employes.add(new Employe("EP68", "Bentley", "Serina"));
		employes.add(new Employe("EP69", "Lane", "Luke"));
		employes.add(new Employe("EP70", "Terry", "Nasim"));
		employes.add(new Employe("EP71", "Mcpherson", "Gemma"));
		employes.add(new Employe("EP72", "Chandler", "Vance"));
		employes.add(new Employe("EP73", "Carey", "Cameran"));
		employes.add(new Employe("EP74", "Greene", "Forrest"));
		employes.add(new Employe("EP75", "Alford", "Cailin"));
		employes.add(new Employe("EP76", "Manning", "Quentin"));
		employes.add(new Employe("EP77", "Wright", "Tara"));
		employes.add(new Employe("EP78", "Guerrero", "Laura"));
		employes.add(new Employe("EP79", "Burgess", "Jael"));
		employes.add(new Employe("EP80", "Davenport", "Stacy"));
		employes.add(new Employe("EP81", "Hunt", "Dustin"));
		employes.add(new Employe("EP82", "Cox", "Ishmael"));
		employes.add(new Employe("EP83", "Mccarty", "Galena"));
		employes.add(new Employe("EP84", "Watts", "Keiko"));
		employes.add(new Employe("EP85", "Mendez", "Wesley"));
		employes.add(new Employe("EP86", "Hartman", "Marcia"));
		employes.add(new Employe("EP87", "Snider", "Orli"));
		employes.add(new Employe("EP88", "Chase", "Barbara"));
		employes.add(new Employe("EP89", "Fitzgerald", "David"));
		employes.add(new Employe("EP90", "Barrera", "Chandler"));
		employes.add(new Employe("EP91", "Bauer", "Keith"));
		employes.add(new Employe("EP92", "Hines", "Darius"));
		employes.add(new Employe("EP93", "Sloan", "Demetrius"));
		employes.add(new Employe("EP94", "Hawkins", "Amena"));
		employes.add(new Employe("EP95", "Nielsen", "Xenos"));
		employes.add(new Employe("EP96", "Hyde", "Liberty"));
		employes.add(new Employe("EP97", "Burns", "Carl"));
		employes.add(new Employe("EP98", "Clayton", "Ella"));
		employes.add(new Employe("EP99", "Casey", "Irma"));
		employes.add(new Employe("EP100", "Harrington", "Ina"));
	}

	private void initBoxes() {
		boxes = new ArrayList<Box>();
		boxes.add(new Box(74, new Product("F9T7FN4TG33WC5F", 43, 22, 86), new Coordinate(0, 5, 3)));
		boxes.add(new Box(61, new Product("W3P3NV5OZ24BD1K", 11, 92, 42), new Coordinate(0, 2, 4)));
		boxes.add(new Box(2, new Product("H5J4CP8ZY18SO6R", 2, 73, 4), new Coordinate(1, 5, 5)));
		boxes.add(new Box(79, new Product("X9M7UD2NL47SB2W", 24, 96, 60), new Coordinate(3, 1, 3)));
		boxes.add(new Box(79, new Product("H4O1ZU7DU23ZR9V", 18, 5, 15), new Coordinate(3, 10, 4)));
		boxes.add(new Box(83, new Product("B4Z7QN1IB81OT5J", 56, 88, 48), new Coordinate(0, 7, 1)));
		boxes.add(new Box(91, new Product("T1M7UW4AQ18KM6V", 16, 2, 19), new Coordinate(2, 9, 1)));
		boxes.add(new Box(60, new Product("P3L5YD5GB59LN5G", 64, 30, 1), new Coordinate(1, 1, 3)));
		boxes.add(new Box(22, new Product("E5T2VO1WB17UG7V", 48, 84, 8), new Coordinate(2, 8, 4)));
		boxes.add(new Box(82, new Product("L5C1TR4OO94MD2D", 71, 35, 93), new Coordinate(2, 1, 3)));
		boxes.add(new Box(11, new Product("I8D7TY9PU73UO6G", 32, 47, 24), new Coordinate(3, 3, 2)));
		boxes.add(new Box(71, new Product("D7I1ZY8PZ28HZ5G", 18, 72, 70), new Coordinate(3, 7, 4)));
		boxes.add(new Box(5, new Product("E6Y2OB1DQ45VQ7E", 47, 85, 96), new Coordinate(2, 8, 2)));
		boxes.add(new Box(60, new Product("H9X5TL5LW53HI2M", 13, 17, 17), new Coordinate(3, 10, 4)));
		boxes.add(new Box(56, new Product("M9H5AP9UB56GZ6U", 8, 2, 18), new Coordinate(3, 6, 4)));
		boxes.add(new Box(68, new Product("U3E9BQ8AJ88KI2Y", 59, 16, 52), new Coordinate(3, 6, 1)));
		boxes.add(new Box(62, new Product("V8X6ID5OY52GU8A", 20, 46, 22), new Coordinate(3, 5, 3)));
		boxes.add(new Box(71, new Product("O5T2PR6JM18QK2T", 59, 76, 67), new Coordinate(2, 6, 4)));
		boxes.add(new Box(21, new Product("J2Q4CM4PA37CR9H", 62, 43, 65), new Coordinate(0, 5, 4)));
		boxes.add(new Box(53, new Product("L8G4YY1BK75TU4D", 84, 9, 92), new Coordinate(1, 7, 1)));
		boxes.add(new Box(53, new Product("G2C7RA6HE49OM3R", 97, 95, 73), new Coordinate(0, 3, 1)));
		boxes.add(new Box(38, new Product("N5X2ZA1TS18VO6K", 72, 12, 89), new Coordinate(2, 10, 3)));
		boxes.add(new Box(37, new Product("K5C4EB9FL61TQ6F", 31, 11, 74), new Coordinate(2, 9, 3)));
		boxes.add(new Box(52, new Product("C1B5KG5DU77ZL1X", 74, 70, 85), new Coordinate(3, 8, 2)));
		boxes.add(new Box(13, new Product("Z3T3RB4JK56TV1R", 3, 36, 4), new Coordinate(3, 6, 2)));
		boxes.add(new Box(6, new Product("A5D1IU3CK74MO6P", 4, 28, 6), new Coordinate(0, 8, 3)));
		boxes.add(new Box(11, new Product("X9A6MS3GH48JQ7K", 37, 37, 57), new Coordinate(2, 5, 1)));
		boxes.add(new Box(12, new Product("F3J7HK8OO47RH1B", 92, 73, 48), new Coordinate(0, 6, 1)));
		boxes.add(new Box(15, new Product("N6S2KX8CT13UJ3C", 46, 20, 96), new Coordinate(2, 6, 5)));
		boxes.add(new Box(2, new Product("A3R2TE7IL62ZP3D", 62, 30, 83), new Coordinate(2, 9, 4)));
		boxes.add(new Box(32, new Product("A4N5TM4IR82VN7V", 59, 24, 85), new Coordinate(0, 4, 4)));
		boxes.add(new Box(79, new Product("O1A8PZ4RQ73GS3X", 99, 41, 51), new Coordinate(3, 8, 4)));
		boxes.add(new Box(73, new Product("G2T7BE4YL83ID4A", 20, 28, 11), new Coordinate(3, 9, 5)));
		boxes.add(new Box(43, new Product("M6Q9HR9ZQ92PU5H", 78, 84, 58), new Coordinate(2, 4, 2)));
		boxes.add(new Box(65, new Product("C1Q5IS4MA96TD1Y", 68, 18, 11), new Coordinate(0, 5, 4)));
		boxes.add(new Box(70, new Product("T4X6EQ1KH49SI3T", 22, 99, 42), new Coordinate(2, 2, 4)));
		boxes.add(new Box(15, new Product("S9H3BG1CE46MS8Z", 47, 65, 65), new Coordinate(2, 10, 4)));
		boxes.add(new Box(88, new Product("R4D5RV8BQ31KB6K", 75, 75, 49), new Coordinate(2, 7, 1)));
		boxes.add(new Box(70, new Product("N6N3PJ3KF67BX9X", 59, 99, 16), new Coordinate(0, 9, 5)));
		boxes.add(new Box(40, new Product("D1F1IF6EL47FN1B", 7, 80, 99), new Coordinate(1, 5, 4)));
		boxes.add(new Box(48, new Product("F1F1SX8UI43CZ4L", 10, 17, 16), new Coordinate(3, 10, 2)));
		boxes.add(new Box(48, new Product("X3R4AA5TG41DK9C", 29, 90, 32), new Coordinate(1, 4, 4)));
		boxes.add(new Box(78, new Product("B2U2YZ4SF33HY2A", 93, 54, 8), new Coordinate(0, 7, 3)));
		boxes.add(new Box(23, new Product("F6U6RJ1NS12GB4Z", 93, 89, 87), new Coordinate(0, 10, 1)));
		boxes.add(new Box(75, new Product("R6A3ET8OY12ZW4H", 16, 26, 1), new Coordinate(3, 4, 1)));
		boxes.add(new Box(63, new Product("U7R7OK2TT98KO2I", 75, 90, 65), new Coordinate(0, 7, 2)));
		boxes.add(new Box(65, new Product("V1E8SQ1EU76LK3W", 27, 56, 15), new Coordinate(3, 3, 1)));
		boxes.add(new Box(60, new Product("J3V9FM4CU49ME6C", 87, 39, 66), new Coordinate(1, 2, 5)));
		boxes.add(new Box(38, new Product("N4H9WJ2JQ73DJ6M", 77, 18, 51), new Coordinate(1, 9, 3)));
		boxes.add(new Box(59, new Product("I3A9AO2ZB61TT3P", 15, 49, 47), new Coordinate(0, 2, 5)));
		boxes.add(new Box(50, new Product("F2B4SN4LV12ZG2A", 30, 52, 2), new Coordinate(1, 5, 2)));
		boxes.add(new Box(67, new Product("T8C5HR4VN56EQ7K", 78, 39, 11), new Coordinate(1, 5, 2)));
		boxes.add(new Box(13, new Product("W4T1YL5QS96LV8H", 4, 40, 32), new Coordinate(2, 1, 3)));
		boxes.add(new Box(57, new Product("L7S4PZ1KW94CQ8W", 14, 60, 90), new Coordinate(1, 9, 1)));
		boxes.add(new Box(7, new Product("F7N9HT8KX79KY5W", 65, 91, 77), new Coordinate(1, 7, 4)));
		boxes.add(new Box(85, new Product("C7F8OX4QD65GI3J", 99, 17, 76), new Coordinate(3, 2, 5)));
		boxes.add(new Box(17, new Product("P6A2XZ4XE15HQ1Y", 73, 42, 14), new Coordinate(1, 5, 3)));
		boxes.add(new Box(64, new Product("Z2P8AV3EV72GH7W", 94, 2, 36), new Coordinate(2, 2, 3)));
		boxes.add(new Box(58, new Product("L6E1AZ2EY66GC4Z", 73, 28, 42), new Coordinate(3, 9, 2)));
		boxes.add(new Box(39, new Product("F4H3BF2TE61NJ1X", 17, 97, 45), new Coordinate(1, 4, 1)));
		boxes.add(new Box(56, new Product("X7F3TM3HI32SE1T", 100, 70, 33), new Coordinate(3, 10, 2)));
		boxes.add(new Box(97, new Product("G4S4AI2QR32WZ3H", 56, 56, 38), new Coordinate(3, 1, 4)));
		boxes.add(new Box(52, new Product("D4X9PY9PT46YZ1I", 25, 11, 58), new Coordinate(0, 4, 5)));
		boxes.add(new Box(24, new Product("P1O8TE1TX98MN6P", 85, 40, 90), new Coordinate(0, 4, 4)));
		boxes.add(new Box(59, new Product("N1R5FE9TV84XP3B", 92, 53, 69), new Coordinate(1, 9, 5)));
		boxes.add(new Box(40, new Product("G6Q8RR6XH82MU5C", 28, 69, 62), new Coordinate(1, 7, 4)));
		boxes.add(new Box(39, new Product("D3P3ML2UH24MF7F", 93, 39, 48), new Coordinate(3, 1, 2)));
		boxes.add(new Box(100, new Product("P5B4ZK7BU47UI2Y", 68, 48, 18), new Coordinate(1, 1, 3)));
		boxes.add(new Box(95, new Product("F7H7OS8LN17CX2K", 65, 99, 26), new Coordinate(1, 4, 5)));
		boxes.add(new Box(92, new Product("Q6Q5DZ3BC15CZ9O", 35, 7, 43), new Coordinate(2, 4, 3)));
		boxes.add(new Box(84, new Product("F6N3JE8RA13UZ4W", 34, 49, 4), new Coordinate(2, 1, 1)));
		boxes.add(new Box(96, new Product("O7P9QD8EU56UN6E", 50, 58, 67), new Coordinate(0, 8, 2)));
		boxes.add(new Box(84, new Product("L2Q3WM1ZH24FM1M", 91, 66, 89), new Coordinate(3, 5, 2)));
		boxes.add(new Box(75, new Product("F3T2ZS2DX89MQ9Z", 18, 34, 87), new Coordinate(0, 8, 2)));
		boxes.add(new Box(5, new Product("D8U4TH1YH83KO7W", 66, 83, 83), new Coordinate(2, 6, 2)));
		boxes.add(new Box(58, new Product("H7W7EB8ZI95JA7T", 95, 52, 70), new Coordinate(2, 8, 2)));
		boxes.add(new Box(14, new Product("A7V2QG6WY98KX7N", 68, 96, 87), new Coordinate(1, 4, 4)));
		boxes.add(new Box(23, new Product("Z6L7XQ7CR16RO5J", 11, 25, 35), new Coordinate(3, 7, 2)));
		boxes.add(new Box(73, new Product("S4G2XK6TQ81MJ6C", 79, 98, 35), new Coordinate(2, 5, 1)));
		boxes.add(new Box(81, new Product("A8U7BM5RA91DO3H", 69, 14, 100), new Coordinate(0, 7, 2)));
		boxes.add(new Box(8, new Product("S1H3FJ2AZ51YI6Q", 85, 79, 14), new Coordinate(1, 10, 4)));
		boxes.add(new Box(32, new Product("P9F7WU4LJ15QQ7N", 2, 75, 93), new Coordinate(1, 9, 4)));
		boxes.add(new Box(88, new Product("S7Z8RH1ZK19UI1N", 11, 63, 100), new Coordinate(0, 2, 5)));
		boxes.add(new Box(47, new Product("V3V5ME4KI19CP5Y", 25, 93, 58), new Coordinate(3, 3, 1)));
		boxes.add(new Box(98, new Product("S7G1JG4PM15PC7W", 40, 54, 39), new Coordinate(3, 6, 5)));
		boxes.add(new Box(23, new Product("O5X5UA5EZ13FM7M", 20, 43, 64), new Coordinate(2, 10, 4)));
		boxes.add(new Box(20, new Product("E8F8MX6AF41UM6L", 61, 7, 30), new Coordinate(1, 7, 4)));
		boxes.add(new Box(21, new Product("V9S2TT9OU44IP8E", 96, 84, 7), new Coordinate(3, 3, 2)));
		boxes.add(new Box(87, new Product("O8C6QB9AY36MW5S", 37, 47, 93), new Coordinate(0, 8, 4)));
		boxes.add(new Box(10, new Product("K1T2UO4EF88JX5L", 56, 4, 59), new Coordinate(1, 1, 5)));
		boxes.add(new Box(59, new Product("F4N6LD7QW44ZK9E", 16, 11, 95), new Coordinate(2, 6, 2)));
		boxes.add(new Box(17, new Product("J8T5ED1UV21CB5L", 40, 14, 32), new Coordinate(0, 8, 5)));
		boxes.add(new Box(69, new Product("A6H3WF8IG83AO4V", 85, 19, 96), new Coordinate(0, 8, 4)));
		boxes.add(new Box(80, new Product("X8K8RN7SC25HL3G", 61, 66, 33), new Coordinate(3, 3, 2)));
		boxes.add(new Box(91, new Product("G8F2ZW4JN68SO6X", 59, 83, 22), new Coordinate(0, 10, 4)));
		boxes.add(new Box(84, new Product("L6Y2TH2NG56KX2C", 49, 80, 55), new Coordinate(1, 9, 1)));
		boxes.add(new Box(61, new Product("V1W1RY1YL53BU4N", 95, 23, 60), new Coordinate(3, 1, 1)));
		boxes.add(new Box(22, new Product("Q7S8OA5KF81JB8E", 27, 35, 9), new Coordinate(0, 9, 5)));
		boxes.add(new Box(90, new Product("S6X2PX2TA81DR9K", 10, 19, 24), new Coordinate(3, 1, 2)));
		boxes.add(new Box(11, new Product("D8I3JU7PV11EQ1U", 31, 80, 64), new Coordinate(1, 9, 3)));

	}

	private void link(){
		for(int i = 0; i < warehouses.size(); i++){
			warehouses.get(i).setLeader(employes.get(i));
			employes.get(i).setWorkPlace(warehouses.get(i));
			for (Box box : boxes) {
				warehouses.get(i).getAllBoxes().add(new Box(box));
			}
		}
		
		for(int i = 0; i < employes.size(); i++){
			employes.get(i).getToDoToday().add(events.get(i));
		}
	}
	
	
	public Employe getEmployeById(String id){
		for (Employe emp : getEmployes()) {
			if(emp.getId().equals(id)){
				return emp;
			}
		}
		return null;
	}

	public Warehouse getWarehouseById(String id){
		for (Warehouse ware : getWarehouses()) {
			if(ware.getId().equals(id)){
				return ware;
			}
		}
		return null;
	}	
	
	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	public List<Box> getBoxes() {
		return boxes;
	}

	public void setBoxes(List<Box> boxes) {
		this.boxes = boxes;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public List<Warehouse> getWarehouses() {
		return warehouses;
	}

	public void setWarehouses(List<Warehouse> warehouses) {
		this.warehouses = warehouses;
	}
}
