const movies = require("../data/movies")

module.exports = (app) => {
  app.get("/api/v1/get/movie", (req, res) => {
    console.log("Get Movie");
    const response = movies;

    res.status(200).json({ message: "Movie fetched successfully!", response });
  });
};
