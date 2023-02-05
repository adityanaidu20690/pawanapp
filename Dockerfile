# Use the Node.js base image
FROM node:14

# Set the working directory
WORKDIR /app

# Copy the package.json and package-lock.json files
COPY package*.json ./

# Install the dependencies
RUN npm install

# Copy the rest of the files
COPY . .

# Build the Angular application
RUN npm run build

# Expose the port on which the application will run
EXPOSE 4200

# Start the application
CMD ["npm", "start"]
#CMD ["ng", "serve", "--host", "0.0.0.0", "--disable-host-check"]
