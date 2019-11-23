package fa.appcode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.appcode.model.Channel;
import fa.appcode.repository.ChannelRepository;

@Service
public class ChannelServiceImpl implements ChannelService{
	
	@Autowired
	ChannelRepository channelRepository;

	@Override
	public List<Channel> findAllChannel() {
		return channelRepository.findAll();
	}

}
