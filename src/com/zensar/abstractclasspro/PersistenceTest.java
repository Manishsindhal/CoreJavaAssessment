package com.zensar.abstractclasspro;

abstract class Persistence {
	public static boolean isStoreInFilePers = false;
	public static boolean isStoreInDataBasePers = false;

	abstract void persist();
}

class FilePersistence extends Persistence {
	// boolean isStore = false;

	public FilePersistence(boolean isStore) {
		Persistence.isStoreInFilePers = isStore;
		Persistence.isStoreInDataBasePers = false;
	}

	@Override
	void persist() {
		// TODO Auto-generated method stub
		// isStoreInFilePers = true;
		// isStoreInDataBasePers = false;
		if (Persistence.isStoreInFilePers)
			System.out.println("Data persisted into File");
	}

}

class DatabasePersistence extends Persistence {

	public DatabasePersistence(boolean isStore) {
		Persistence.isStoreInDataBasePers = isStore;
		Persistence.isStoreInFilePers = false;
	}

	@Override
	void persist() {
		// TODO Auto-generated method stub
		// isStoreInDataBasePers = true;
		// isStoreInFilePers = false;
		if (Persistence.isStoreInDataBasePers)
			System.out.println("Data persisted into Database");
	}

}

public class PersistenceTest {

	public static void main(String[] args) {
		Persistence filePersistence = new FilePersistence(true);
		filePersistence.persist();
		
		Persistence dataPersistence = new DatabasePersistence(false);
		dataPersistence.persist();

//		if (Persistence.isStoreInFilePers) {
//			persistence = new FilePersistence();
//			persistence.persist();
//		} else if (Persistence.isStoreInDataBasePers) {
//			persistence = new DatabasePersistence();
//			persistence.persist();
//		}

	}
}
