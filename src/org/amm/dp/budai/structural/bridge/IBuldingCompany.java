package org.amm.dp.budai.structural.bridge;

interface IBuldingCompany {
	
	void BuildFoundation();

	void BuildRoom();

	void BuildRoof();

	void setWallCreator(IWallCreator conctreteSlabWallCreator);

	IWallCreator getWallCreator();
}
