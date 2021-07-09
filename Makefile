rebuild-jar:
	@echo ">>> creating new jar executatble..."
	@mvn clean package

deploy:
	@make rebuild-jar
	@echo ">>>  take down current image/container...."
	@docker-compose down --remove-orphans

	@echo ">>>  cleaning docker current image/container...."
	@docker system prune -f
	@docker volume ls -qf dangling=true | xargs -r docker volume rm
	@docker images -q --filter dangling=true | xargs -r docker rmi -f

	@echo ">>> building and running app with docker container...."
	@docker-compose up --build -d
