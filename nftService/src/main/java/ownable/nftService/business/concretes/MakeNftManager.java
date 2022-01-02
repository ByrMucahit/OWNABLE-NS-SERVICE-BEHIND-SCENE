package ownable.nftService.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ownable.nftService.business.abstracts.MakeNftService;
import ownable.nftService.core.concretes.results.DataResult;
import ownable.nftService.core.concretes.results.Result;
import ownable.nftService.core.concretes.results.SuccessDataResult;
import ownable.nftService.core.concretes.results.SuccessResult;
import ownable.nftService.dataAccess.dao.MakeNFTDao;
import ownable.nftService.entities.concretes.MakeNFT;
@Service
public class MakeNftManager implements MakeNftService {
	
	private MakeNFTDao makeNftDao;
	
	@Autowired
	public MakeNftManager(MakeNFTDao makeNftDao) {
		this.makeNftDao = makeNftDao;
	}

	@Override
	public DataResult<List<MakeNFT>> getAll() {
		return new SuccessDataResult<List<MakeNFT>>
		(this.makeNftDao.findAll(), "Data has been listed");
	}

	@Override
	public Result insertInto(MakeNFT makenNFT) {
		this.makeNftDao.save(makenNFT);
		return new SuccessResult("Product has been added");
	}

	@Override
	public Result delete(int codeOfAccount) {
		makeNftDao.deleteById(codeOfAccount);
		return new SuccessResult("Product has been deleted");
	}

	@Override
	public Result update(MakeNFT makeNFT, int codeOfAccount) {
		MakeNFT currentMakeNFT = makeNftDao.findById(codeOfAccount).orElseThrow(RuntimeException::new);
		currentMakeNFT.setDescription(makeNFT.getDescription());
		currentMakeNFT.setEmail(makeNFT.getEmail());
		currentMakeNFT.setFirstName(makeNFT.getFirstName());
		currentMakeNFT.setImage(makeNFT.getImage());
		currentMakeNFT.setLastName(makeNFT.getLastName());
		currentMakeNFT.setPassword(makeNFT.getPassword());
		currentMakeNFT.setPhoneNumber(makeNFT.getPhoneNumber());
		currentMakeNFT.setTokenName(makeNFT.getTokenName());
		currentMakeNFT.setTypeOfAsset(makeNFT.getTypeOfAsset());
		currentMakeNFT.setUserName(makeNFT.getUserName());
		currentMakeNFT.setTypeOfAsset(makeNFT.getTypeOfAsset());
		
		makeNftDao.save(currentMakeNFT);
		
		return new SuccessResult("Product has been updated");
	}

}
